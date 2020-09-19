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
 * Servlet implementation class adminServletSearchInscID
 */
@WebServlet("/adminServletSearchInscID")
public class adminServletSearchInscID extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminServletSearchInscID() {
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
		String url="/AdminInterface.jsp";
		int numPage=0;
		request.setAttribute("numPage", numPage);
		String InscID=request.getParameter("inscS");
		try {
			List<Etudiant> l=TestSystem.getEtudiant(InscID,0,0,0);
			if (!InscID.equals("")&&(l!=null))
			{
			
			
			request.setAttribute("l", l);
			}
			else
			{
				 l=TestSystem.getEtudiants();
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
