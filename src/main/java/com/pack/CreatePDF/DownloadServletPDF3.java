package com.pack.CreatePDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadServletPDF3
 */
@WebServlet("/DownloadServletPDF3")
public class DownloadServletPDF3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadServletPDF3() {
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
		 String nameFile =request.getParameter("nameFile");
	        
	        FileInputStream baos = new FileInputStream(nameFile);

	         response.setHeader("Expires", "0");
	         response.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
	         response.setHeader("Pragma", "public");
	         response.setContentType("application/pdf");
	         response.addHeader("Content-Disposition", "attachment; filename=Attestation-de-succés.pdf");

	         OutputStream os = response.getOutputStream();

	         byte buffer[] = new byte[8192];
	         int bytesRead;

	         while ((bytesRead = baos.read(buffer)) != -1) {
	             os.write(buffer, 0, bytesRead);
	         }

	         os.flush();
	         os.close();
	}

}
