package it.sincrono.corso.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.sincrono.corso.model.ActorImpl;
import it.sincrono.corso.model.Actor;
/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String p=request.getParameter("nomeAttore");
		ActorImpl al=new ActorImpl();
		List<Actor> lista=al.findByName(p);
		RequestDispatcher rd=request.getRequestDispatcher("view/actorResult.jsp");
		request.setAttribute("attoriByName",lista);
		rd.forward(request, response);
	}

}
