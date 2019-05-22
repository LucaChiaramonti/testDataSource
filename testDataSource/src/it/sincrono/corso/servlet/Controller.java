package it.sincrono.corso.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public Controller()
	{
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=null;
		switch(request.getParameter("cerca"))
		{
			case "cercaPerId":		rd=request.getRequestDispatcher("/CercaPerId");break;
			case "cercaPerNome":    rd=request.getRequestDispatcher("/Servlet");break; 
			case "cercaTutti" : 	rd=request.getRequestDispatcher("/StampaTutti");break; 
			case "aggiungiAttore":        rd=request.getRequestDispatcher("/AggiungiAttore");break;
		}
		
		rd.forward(request, response);
	}

}
