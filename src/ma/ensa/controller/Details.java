package ma.ensa.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ma.ensa.model.Article;
import ma.ensa.model.DBConnection;

/**
 * Servlet implementation class Details
 */
@WebServlet("/Details")
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DBConnection D = new DBConnection ();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Details() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 String nums= (String) request.getParameter("num"); 	
	 String codes = (String) request.getParameter("id");
	 int num=0;
	 int code=0;
	 if (nums!=null) {
		   num= Integer.parseInt(nums);
	 }
	 if (codes!=null) {
		   code= Integer.parseInt(codes);
	 }
	 try {
		 if (code>0) {
			 Article A = D.getArticles(code);
				request.setAttribute("arti", A);
				 request.getRequestDispatcher("detail.jsp").forward(request, response); 
		 }
		 if (num>0) {
			 Article A = D.getArticles(num);
			 HttpSession session= request.getSession();
			    Enumeration<String> names = session.getAttributeNames();
				// Nombre d'articles dans la session
			int nbArticles = Collections.list(names).size();
				// Incrementer le nombre d'articles
				nbArticles++;
				session.setAttribute("article" + nbArticles, A.toString());
				request.setAttribute("nombre", nbArticles);
				request.getRequestDispatcher("Panier.jsp").forward(request, response); 
		 }
				
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
