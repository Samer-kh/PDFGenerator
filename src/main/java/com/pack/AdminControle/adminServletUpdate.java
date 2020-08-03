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
 * Servlet implementation class adminServletUpdate
 */
@WebServlet("/adminServletUpdate")
public class adminServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminServletUpdate() {
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
		String fnameU=request.getParameter("fnameU");
		String lnameU=request.getParameter("lnameU");
		String cinU=request.getParameter("cinU");
		String inscU=request.getParameter("inscU");
		String ClassII=request.getParameter("ClassII");
		String idU=request.getParameter("idU");
		int idUint =Integer.parseInt(idU);
		try {
		
		TestSystem.updateEtudiant(idUint,fnameU, lnameU, cinU, inscU , ClassII);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			 String adminName=request.getParameter("adminName1");
			 request.setAttribute("adminName", adminName);
			 List<Etudiant> l=TestSystem.getEtudiants();
			 request.setAttribute("l", l);
			
			
			getServletContext()
			.getRequestDispatcher(url)
			.forward(request,response);
		}
		
	}

}
