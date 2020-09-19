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
		String numPage1=request.getParameter("numPage");
		int numPage=Integer.parseInt(numPage1);
		
		List<Etudiant> l=TestSystem.getEtudiants();
		request.setAttribute("l", l);
		
		if (numPage!=0)
		{
			numPage--;
			request.setAttribute("numPage", numPage);
		}
		else
		{
			request.setAttribute("numPage", numPage);
		}
		getServletContext()
		.getRequestDispatcher(url)
		.forward(request,response);
	}

}
