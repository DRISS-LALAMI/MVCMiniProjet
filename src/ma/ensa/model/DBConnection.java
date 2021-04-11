package ma.ensa.model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.servlet.http.HttpSession;
import com.mysql.cj.conf.ConnectionUrlParser.Pair;
import ma.ensa.model.*;

public class DBConnection {
	Connection connexion = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
    String Email = null;
    ResultSet resultSet = null;
	public DBConnection() {
	       super();
	}
	public void OuvreBase() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection("jdbc:mysql://mysql-25541-0.cloudclusters.net:25541/magasin","driss","DrissLalami@1999");
			connexion.setAutoCommit(true);
			stmt = connexion.createStatement();
		} catch (Exception E) {
			System.out.println(" -------- probleme " + E.getClass().getName());
			E.printStackTrace();
		}
	}
	public void FermeBase() {
		try {
			stmt.close();
			connexion.close();
		} catch (Exception E) {
			System.out.println(" -------- probleme " + E.getClass().getName());
			E.printStackTrace();
		}
	}
	public List<String> getMails() throws SQLException {
	OuvreBase();
	resultSet = stmt.executeQuery("select Email from clients");
	List<String> l = new ArrayList<>();
	while (resultSet.next()) {
		l.add(resultSet.getString("Email"));
	}
	return l;
	}
	public boolean verifymail (Client C) throws SQLException { 
		return  getMails().contains(C.getMail());		
	}
	public boolean Check(Client D) throws SQLException {
	boolean flag=false;
	if(verifymail(D)) {
		 resultSet = stmt.executeQuery("select MotPasse from clients where Email='"+D.getMail() +"'");
		while (resultSet.next()) {
			if(resultSet.getString("MotPasse").equals(D.getMotpasse())) {
				flag=true;
				break;
			}
		}
		}
	return flag;
	}
	public int IdMax() throws SQLException {
		OuvreBase();
		int resultat;
		resultSet=stmt.executeQuery("select max(id) as max from clients");
		resultSet.next();
			 resultat = resultSet.getInt("max");
			 return resultat+1;
	}
	public void AjouterClient(Client C) throws SQLException {
		OuvreBase();
				stmt.executeUpdate("insert into clients  "
		 		+ "(id,Email,Nom,Prenom,Adresse,CodePostal,Ville,Tel,MotPasse) values ("+C.getId()+","
		 		+ "'"+C.getMail()+"','"+C.getNom()+"','"+C.getPrenom()+"','"+C.getAdresse()+"'"
		 				+ ","+C.getCodepostal()+",'"+C.getVille()+"','"
		 						+ ""+C.getTel()+"','"+C.getMotpasse()+"')");
	}
	public List<Article> MontrerCatalogue() throws SQLException {
		OuvreBase();
		List<Article> l = new ArrayList<> ();
		resultSet =stmt.executeQuery("select * from articles");
		while (resultSet.next()) {
			int code= resultSet.getInt("CodeArticle");
			String designation= resultSet.getString("Designation");
			int stock= resultSet.getInt("Stock");
			double prix = resultSet.getDouble("prix");
			String categorie= resultSet.getString("Categorie");
			String photo= resultSet.getString("photo");
			Article arti =  new Article (code,designation,stock,prix,categorie,photo);
			l.add(arti);
		}
		return l;
	}
	public Article getArticles(int id) throws SQLException {
		OuvreBase();
		resultSet =stmt.executeQuery("select * from articles where CodeArticle="+id+" ");
		resultSet.next();
		String Designation=resultSet.getString("Designation");
		double prix=resultSet.getDouble("prix");
		int stock=resultSet.getInt("Stock");
		String categorie=resultSet.getString("Categorie");
		String photo=resultSet.getString("photo");
		Article article = new Article(id,Designation,stock,prix,categorie,photo);
		return article;
	}
}
	
