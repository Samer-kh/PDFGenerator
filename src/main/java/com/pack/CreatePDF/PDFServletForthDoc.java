package com.pack.CreatePDF;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Servlet implementation class PDFServletFirstDoc
 */
@WebServlet("/PDFServletForthDoc")
public class PDFServletForthDoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PDFServletForthDoc() {
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
		 Document document = new Document();
	      try
	      {
	    	  String FName=request.getParameter("FName");
		         String LName=request.getParameter("LName");
		         
		       String DocNom="C:\\Users\\Samer's PC\\eclipse-workspace-ee\\adminGUI\\GeneratedPDFs\\" + FName + "-" + LName + "-Attestation-success.pdf";
	         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(new File(DocNom)));
	         document.open();
	         
	         	//page Fonts 
	        
	         
	        
	         	//ajout du logo de l'ensi 
	      
	         Image image1 = Image.getInstance("C:\\Users\\Samer's PC\\eclipse-workspace-ee\\adminGUI\\WebContent\\img\\ensiLogo.jpg");
	         //Fixed Positioning
	         image1.setAbsolutePosition(10f, 740f);
	         //Scale to new height and new width of image
	         image1.scaleAbsolute(100, 100);
	         //Add to document
	         document.add(image1);
	         
	         //ajout du logo du Mers
	         
	         Image image2 = Image.getInstance("C:\\Users\\Samer's PC\\eclipse-workspace-ee\\adminGUI\\WebContent\\img\\mesrs.jpg");
	         //Fixed Positioning
	         image2.setAbsolutePosition(480f, 740f);
	         //Scale to new height and new width of image
	         image2.scaleAbsolute(100, 100);
	         //Add to document
	         document.add(image2);
	         
	         //Adding the Page title
	         
	         document.add( Chunk.NEWLINE );
	         document.add( Chunk.NEWLINE );
	         
	         
	         Paragraph title=new Paragraph("\n\nAttestation de Succés", FontFactory.getFont(FontFactory.TIMES_ROMAN, 20, Font.ITALIC));
	         title.setAlignment(Element.ALIGN_CENTER);
	         title.setPaddingTop(10);
	         document.add(title);
	         
	         //Adding the info
	         
	       
	         String CIN=request.getParameter("CIN");
	         String InscID=request.getParameter("InscID");
	         String Class=request.getParameter("Class");
	         
	         Chunk Name=new Chunk(FName);
	         Paragraph NameP=new Paragraph(Name);
	         Phrase phName=new Phrase(FName);
	        
	         document.add( Chunk.NEWLINE );
	         document.add( Chunk.NEWLINE );

	         document.add( Chunk.NEWLINE );
	         document.add( Chunk.NEWLINE );

	         String NomF= "Nom de L'etudiant :" + FName + "\n";
	         String PreNomF= "Prenom de L'etudiant :" + LName + "\n";
	         String CINF= "Carte d'identité National :" + CIN + "\n";
	         String InscF= "Numero d'inscription :" + InscID + "\n";
	         String ClassF= "Class :" + Class + "\n\n\n" ;

	         document.add(new Chunk(NomF));
	         document.add(new Chunk(PreNomF));
	         document.add(new Chunk(CINF));
	         document.add(new Chunk(InscF));
	         document.add(new Chunk(ClassF));
	         
	         String Parag = " La direction de l'ENSI affirme que l'etudiant(e) " + FName + " " + LName + " de carte d'identité " + CIN + " ayant le numéro d'inscription " + InscID +" , a reussit ces études  à l'ENSI Pour l'année universitaire 2019/2020 " ;
	         Paragraph ph=new Paragraph (Parag);
	         document.add(ph);
	         
	         Paragraph ph1=new Paragraph("Signature de la direction");
	         ph1.setAlignment(Element.ALIGN_RIGHT);
	         
	         document.add( Chunk.NEWLINE );
	         document.add( Chunk.NEWLINE );
	         document.add( Chunk.NEWLINE );
	         document.add(ph1);
	         document.close();
	         writer.close();
	      } catch (DocumentException e)
	      {
	         e.printStackTrace();
	      } catch (FileNotFoundException e)
	      {
	         e.printStackTrace();
	      }
		finally {
			String url="/UserInterfacePDFGeneratedDoc4.jsp";
			
			getServletContext()
			.getRequestDispatcher(url)
			.forward(request,response);
		}
}}
