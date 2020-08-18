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
 * Servlet implementation class adminServletSearchInscID
 */
@WebServlet("/SuperadminServletSearchAdminName")
public class SuperAdminServletSearchAdminName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuperAdminServletSearchAdminName() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url="/SuperAdminInterface.jsp";
		String AdminName=request.getParameter("AdminName");
		try {
			List<admin> l=GestionAdmin.getAdmins(AdminName);
			if (!AdminNAme.equals("")&&(l!=null))
			{
			
			
			request.setAttribute("l", l);
			}
			else
			{
				 l=GestionAdmin.getAdmins();
				request.setAttribute("l", l);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			
			getServletContext()
			.getRequestDispatcher(url)
			.forward(request,response);
		}
	}

}
