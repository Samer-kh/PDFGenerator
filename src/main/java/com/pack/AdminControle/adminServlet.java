package com.pack.AdminControle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.persistence.*;
import com.pack.admins.*;
import com.pack.adminGUI.*;

/**
 * Servlet implementation class adminServlet
 */
@WebServlet("/adminServlet")
public class adminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url="/AdminInterface.jsp";
		String adminMDP=request.getParameter("adminMDP");
		String adminName=request.getParameter("adminName");
		
		admin ad1=GestionAdmin.getAdmin(adminName);
		if (ad1!=null)
		{
			if (ad1.getAdminMDP()==adminMDP)
			{	
				
				request.setAttribute("adminName", adminName);
				request.setAttribute("adminMDP", adminMDP);
				admin ad=new admin();
				
				ad.setAdminName(adminName);
				ad.setAdminMDP(adminMDP);
				request.setAttribute("ad", ad);
			}
			else
			{
				url="LogAdmin.jsp";
				adminMDP="mot de passe incorrect";
			}
		}
		else
		{
			url="LogAdmin.jsp";
			adminMDP="le nom de l'admin n'existe pas";
		}
		
		getServletContext()
		.getRequestDispatcher(url)
		.forward(request,response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doGet(request,response);
}}
