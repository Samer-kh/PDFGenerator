package com.pack.userControle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.adminGUI.Etudiant;
import com.pack.adminGUI.TestSystem;

/**
 * Servlet implementation class userServletEdit
 */
@WebServlet("/userServletEdit")
public class userServletEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userServletEdit() {
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
		String Url="/LogUser.jsp";
		String EtudCIN=request.getParameter("etud");
		Etudiant etud=TestSystem.getEtudiantCIN(EtudCIN);
		String FName=request.getParameter("FName");
		String LName=request.getParameter("LName");
		String CIN=request.getParameter("CIN");
		String InscID=request.getParameter("InscID");
		String Class=request.getParameter("Class");
		try
		{
			TestSystem.updateEtudiant(etud.getID(), FName, LName, CIN, InscID, Class);
			request.setAttribute("etud", etud);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			getServletContext()
			.getRequestDispatcher(Url)
			.forward(request, response);	
		}
	}

}
