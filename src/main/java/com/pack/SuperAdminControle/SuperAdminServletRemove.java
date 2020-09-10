package com.pack.SuperAdminControle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.admins.admin;
import com.pack.admins.GestionAdmin;

/**
 * Servlet implementation class adminServletRemove
 */
@WebServlet("/SuperAdminServletRemove")
public class SuperAdminServletRemove extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuperAdminServletRemove() {
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
		String url="/SuperAdminInterface.jsp" ;
		String AdminName=request.getParameter("AdminName");
		String AdminMDP=request.getParameter("AdminMDP");
		String ID=request.getParameter("AdminID");
		int IDint=Integer.parseInt(ID);
		
		try {
			GestionAdmin.removeAdmin(IDint ,AdminName,AdminMDP);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
		
			 List<admin> l=GestionAdmin.getAdmins();
			 request.setAttribute("l", l);	
			 
			 getServletContext()
				.getRequestDispatcher(url)
				.forward(request,response);
		}
	}

}
