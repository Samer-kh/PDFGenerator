package com.pack.AdminControle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.adminGUI.Etudiant;
import com.pack.adminGUI.TestSystem;

/**
 * Servlet implementation class adminServletControlPageP
 */
@WebServlet("/adminServletControlPageP")
public class adminServletControlPageP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminServletControlPageP() {
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
		String url="/AdminInterface.jsp";
		String numPage=request.getParameter("numPage");
		int numPageint=Integer.parseInt(numPage);
		
		List<Etudiant> l=TestSystem.getEtudiants();
		request.setAttribute("l", l);
		
		if (numPageint==0)
		{
			request.setAttribute("numPageInt", numPage);
		}
		else
		{
			numPageint-=5;
			request.setAttribute("numPageInt", numPage);
		}
		getServletContext()
		.getRequestDispatcher(url)
		.forward(request,response);
	}

}
