package ma.ensa.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ma.ensa.model.*;
import ma.ensa.model.DBConnection;

/**
 * Servlet implementation class CatalogueControler
 */
@WebServlet("/CatalogueControler")
public class CatalogueControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DBConnection D= new DBConnection();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatalogueControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			List <Article> list =D.MontrerCatalogue();
			request.setAttribute("arti", list);
			request.getRequestDispatcher("Catalogue.jsp").forward(request, response);
			
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
