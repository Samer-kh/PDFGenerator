package com.pack.userControle;

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
 * Servlet implementation class userServlet
 */
@WebServlet("/userServlet")
public class userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userServlet() {
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
		String Url="/UserInterface.jsp";
		String CIN=request.getParameter("userCIN");
		String remarque="";
		Etudiant etud=TestSystem.getEtudiantCIN(CIN);
		try
		{
			 List<Etudiant> L=TestSystem.getEtudiant(CIN);
			 if(etud!=null)
			 {
				request.setAttribute("etud", etud); 
			 }
			 else
			 {
				 Url="/LogUser.jsp";
				 remarque="donnée incorrect";
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			request.setAttribute("remarque", remarque);
			getServletContext()
			.getRequestDispatcher(Url)
			.forward(request,response);
		}}

}
