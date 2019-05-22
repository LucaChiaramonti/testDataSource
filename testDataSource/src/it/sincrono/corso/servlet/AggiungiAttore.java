package it.sincrono.corso.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.sincrono.corso.model.Actor;
import it.sincrono.corso.model.ActorImpl;

/**
 * Servlet implementation class AggiungiAttore
 */
@WebServlet("/AggiungiAttore")
public class AggiungiAttore extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher rd;String s=null;
		String n=request.getParameter("aggNomeAttore");
		String c=request.getParameter("aggCognomeAttore");
		boolean f=false;
		ActorImpl al=new ActorImpl();
		
		if(al.insertActor(n, c)==1)
			s="L'attore è stato aggiunto";
		else
			s="L'attore non è stato aggiunto";
		rd=request.getRequestDispatcher("view/risultatoAggiunta.jsp");
		request.setAttribute("risultato",s);
		rd.forward(request, response);
	}

}
