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
import com.pack.admins.String;
/**
 * Servlet implementation class adminServletUpdate
 */
@WebServlet("/SuperAdminServletUpdate")
public class SuperAdminServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuperAdminServletUpdate() {
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
		String AdminName=request.getParameter("AdminName");
		String AdminMDP=request.getParameter("AdminMDP");
		String AdminMDP=request.getParameter("AdminNewMDP");
	
		try {
		
		GestionAdmin.updateAdmin(AdminName,AdminMDP,AdminNewMDP);
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
