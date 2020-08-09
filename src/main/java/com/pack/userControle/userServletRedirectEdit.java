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
 * Servlet implementation class userServletRedirectEdit
 */
@WebServlet("/userServletRedirectEdit")
public class userServletRedirectEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userServletRedirectEdit() {
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
		String Url="UserInterfaceEdit.jsp";
		String etudCin=request.getParameter("etud");
		Etudiant etud=TestSystem.getEtudiantCIN(etudCin);
		request.setAttribute("etud", etud);
		
		getServletContext()
		.getRequestDispatcher(Url)
		.forward(request, response);
		
		
		
	}

}
