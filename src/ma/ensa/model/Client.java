package ma.ensa.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.conf.ConnectionUrlParser.Pair;
public class Client {
private int Id;	
private String mail;
private String Nom;
private String Prenom;
private String Adresse;
private int Codepostal;
private String ville;
private String tel;
private String Motpasse;

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public String getNom() {
	return Nom;
}

public void setNom(String nom) {
	Nom = nom;
}

public String getPrenom() {
	return Prenom;
}

public void setPrenom(String prenom) {
	Prenom = prenom;
}

public String getAdresse() {
	return Adresse;
}

public void setAdresse(String adresse) {
	Adresse = adresse;
}

public int getCodepostal() {
	return Codepostal;
}

public void setCodepostal(int codepostal) {
	Codepostal = codepostal;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}

public String getMotpasse() {
	return Motpasse;
}

public void setMotpasse(String motpasse) {
	Motpasse = motpasse;
}
public Client(String mail, String motpasse) {
	super();
	this.mail = mail;
	Motpasse = motpasse;
}

public Client(int id, String mail, String nom, String prenom, String adresse, int codepostal, String ville, String tel,
		String motpasse) {
	super();
	Id = id;
	this.mail = mail;
	Nom = nom;
	Prenom = prenom;
	Adresse = adresse;
	Codepostal = codepostal;
	this.ville = ville;
	this.tel = tel;
	Motpasse = motpasse;
}

}
