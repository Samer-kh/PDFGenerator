package com.pack.SuperAdminControle;
import com.pack.Admins.*;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import com.pack.adminGUI.*;
/**
 * Servlet implementation class adminServletAdd
 */
@WebServlet("/SuperAdminServletAdd")
public class SuperAdminServletAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuperAdminServletAdd() {
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
		String Url="/SuperAdminInterface.jsp";
		String AdminName=request.getParameter("AdminName");
		String AdminMDP=request.getParameter("AdminMDP");
		
		try {
			
		GestionAdmin.addAdmin(AdminName, AdminMDP);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
		List<admin> l=GestionAdmin.getAdmins();
		request.setAttribute("l", l);
		getServletContext()
		.getRequestDispatcher(Url)
		.forward(request,response);
	}}

}