package com.pack.SuperAdminControle;


import java.io.IOException;

import java.lang.String;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.persistence.*;
import com.pack.admins.*;
import com.pack.adminGUI.*;
import com.pack.SuperAdmin.GestionSuperAdmin;
import com.pack.SuperAdmin.SuperAdmin;

/**
 * Servlet implementation class adminServlet
 */
@WebServlet("/SuperAdminServlet")
public class SuperAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuperAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url="/SuperAdminInterface.jsp";
		String SuperAdminMDP=request.getParameter("SuperAdminMDP");
		String SuperAdminName=request.getParameter("SuperAdminName");
		String remarque="";
		 List<admin> l=(List<admin>) GestionAdmin.getAdmins();
		try
		{
		SuperAdmin ad1= GestionSuperAdmin.getSuperAdmin(SuperAdminName);
		if (ad1!=null)
		{
			if (ad1.getSuperAdminMDP().equals(SuperAdminMDP))
			{	
				
				request.setAttribute("SuperAdminName", SuperAdminName);
				request.setAttribute("SuperAdminMDP", SuperAdminMDP);
				SuperAdmin ad=new SuperAdmin();
				
				ad.setSuperAdminName(SuperAdminName);
				ad.setSuperAdminMDP(SuperAdminMDP);
				request.setAttribute("ad", ad);
			}
			else
			{
				url="/LogSuperAdmin.jsp";
				remarque="mot de passe incorrect";
			}
		}
		else
		{
			url="/LogSuperAdmin.jsp";
			remarque="le nom de l'admin n'existe pas";
		}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{	int j=0;
			Admin[] adminTab=new Admin[l.size()];
		  for (int i = 0; i < l.size(); i++)
			{
			  adminTab[j]=l.get(i);
			  j++;
			}
			
			request.setAttribute("remarque", remarque);
			request.setAttribute("adminTab", adminTab);
			request.setAttribute("l", l);
		getServletContext()
		.getRequestDispatcher(url)
		.forward(request,response);
	}}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO AuSSSSto-generated method stub
	doGet(request,response);
}}
