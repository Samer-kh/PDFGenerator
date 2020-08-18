package com.pack.SuperAdminControle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.admins.GestionAdmin;
import com.pack.admins.admin;

/**
 * Servlet implementation class adminServletControlPageN
 */
@WebServlet("/SuperAdminServletControlPageN")
public class SuperAdminServletControlPageN extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuperAdminServletControlPageN() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url="/SuperAdminInterface.jsp";

		
		String numPage1=request.getParameter("numPage");
		int numPage=Integer.parseInt(numPage1);
		List<admin> l=GestionAdmin.getAdmins();
		request.setAttribute("l", l);
		if (l.size()-5*(numPage+1) < 0)
		{
		
			request.setAttribute("numPageint", numPage);
		}
		else
		{
			numPage+=1;
			request.setAttribute("numPageint", numPage);
		}
		getServletContext()
		.getRequestDispatcher(url)
		.forward(request,response);
	}

}