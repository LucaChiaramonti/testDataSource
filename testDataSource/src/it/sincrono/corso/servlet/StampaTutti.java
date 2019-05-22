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
 * Servlet implementation class StampaTutti
 */
@WebServlet("/StampaTutti")
public class StampaTutti extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ActorImpl al=new ActorImpl();
		List<Actor> lista=al.readAll();
		RequestDispatcher rd=request.getRequestDispatcher("view/actorResult.jsp");
		request.setAttribute("attoriByName",lista);
		rd.forward(request, response);
	}

}
