package com.pack.adminGUI;

import java.util.List;
import javax.persistence.*;

public class TestSystem {

	 private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
	            .createEntityManagerFactory("adminGUI");
/*	
	public static void main(String[] args)
	{
		List<Etudiant> l=getEtudiants();
		for (int i = 0; i < l.size(); i++)
		{
		  System.out.println(l.get(i).getFName());
		  
		}
	}
	
	*/
	public static void addEtudiant(int id , String InscID , String FName , String LName, String CIN , String ClassII)
	{
		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et= null;
		try
		{
			et=em.getTransaction();
			et.begin();
			Etudiant etud=new Etudiant();
			etud.setCIN(CIN);
			etud.setFName(FName);
			etud.setInscID(InscID);
			etud.setLName(LName);
			etud.setClassII(ClassII);
			
			em.persist(etud);
			et.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
	}
	public static Etudiant getEtudiant(int id)
	{
		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
				
		String Query="SELECT e FROM Etudiant e WHERE e.id =: idEtudiant";
		TypedQuery<Etudiant> tq=em.createQuery(Query, Etudiant.class);
				tq.setParameter("idEtudiant",id);
		try
		{
			Etudiant et =new Etudiant();
			et=tq.getSingleResult();
			System.out.println("le resultat est trouvé");
			
			return et;
		}
		catch(Exception e)
		{
			System.out.println("Erreur");
			e.printStackTrace();
			return null;
		}
		finally
		{
			em.close();
		}
	}
	
	public static Etudiant getEtudiantCIN(String CIN)
	{
		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
				
		String Query="SELECT e FROM Etudiant e WHERE e.CIN =: CINEtudiant";
		TypedQuery<Etudiant> tq=em.createQuery(Query, Etudiant.class);
				tq.setParameter("CINEtudiant",CIN);
		try
		{
			Etudiant et =new Etudiant();
			et=tq.getSingleResult();
			System.out.println("le resultat est trouvé");
			
			return et;
		}
		catch(Exception e)
		{
			System.out.println("Erreur");
			e.printStackTrace();
			return null;
		}
		finally
		{
			em.close();
		}
	}
	
	
	public static List<Etudiant> getEtudiant(String CIN)
	{

		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		String strQuery="SELECT e FROM Etudiant e WHERE e.CIN=:cin "	;
		TypedQuery<Etudiant> tq=em.createQuery(strQuery, Etudiant.class);
		tq.setParameter("cin",CIN);
		List<Etudiant> L=null;
		try
		{
			L=tq.getResultList();
			return L;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			em.close();
		}
	}
	
	
	public static List<Etudiant> getEtudiant(String FName,int a)
	{

		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		String strQuery="SELECT e FROM Etudiant e WHERE e.FName=:FName "	;
		TypedQuery<Etudiant> tq=em.createQuery(strQuery, Etudiant.class);
		tq.setParameter("FName",FName);
		List<Etudiant> L=null;
		try
		{
			L=tq.getResultList();
			return L;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			em.close();
		}
	}
	
	public static List<Etudiant> getEtudiant(String LName,int a,int b)
	{

		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		String strQuery="SELECT e FROM Etudiant e WHERE e.LName=:LName "	;
		TypedQuery<Etudiant> tq=em.createQuery(strQuery, Etudiant.class);
		tq.setParameter("LName",LName);
		List<Etudiant> L=null;
		try
		{
			L=tq.getResultList();
			return L;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			em.close();
		}
	}

	public static List<Etudiant> getEtudiant(String InscID,int a,int b,int c)
	{

		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		String strQuery="SELECT e FROM Etudiant e WHERE e.InscID=:InscID "	;
		TypedQuery<Etudiant> tq=em.createQuery(strQuery, Etudiant.class);
		tq.setParameter("InscID",InscID);
		List<Etudiant> L=null;
		try
		{
			L=tq.getResultList();
			return L;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			em.close();
		}
	}
	
	public static List<Etudiant> getEtudiant(String ClassII,int a,int b,int c,int d)
	{

		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		String strQuery="SELECT e FROM Etudiant e WHERE e.ClassII=:ClassII "	;
		TypedQuery<Etudiant> tq=em.createQuery(strQuery, Etudiant.class);
		tq.setParameter("ClassII",ClassII);
		List<Etudiant> L=null;
		try
		{
			L=tq.getResultList();
			return L;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			em.close();
		}
	}
	
	
	
	public static List<Etudiant> getEtudiants()
	{
		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		String strQuery="SELECT e FROM Etudiant e WHERE e.id IS NOT NULL "	;
		TypedQuery<Etudiant> tq=em.createQuery(strQuery, Etudiant.class);
		List<Etudiant> L=null;
		try
		{
			L=tq.getResultList();
			return L;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			em.close();
		}
	
	}
	
	
	
	  public static void updateEtudiant(int id, String fname,String lname, String cin, String insc,String ClassII) {
	        EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        EntityTransaction et = null;
	        
	    	Etudiant etudiant = null;
	 
	        try {
	            // Get transaction and start
	            et = em.getTransaction();
	            et.begin();
	 
	            // Find customer and make changes
	            etudiant = em.find(Etudiant.class, id);
	            etudiant.setFName(fname);
	            etudiant.setLName(lname);
	            etudiant.setCIN(cin);
	            etudiant.setInscID(insc);
	            etudiant.setClassII(ClassII);
	            
	            
	 
	            // Save the customer object
	            em.persist(etudiant);
	            et.commit();
	        } catch (Exception ex) {
	            // If there is an exception rollback changes
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            // Close EntityManager
	            em.close();
	        }
	    }
	  public static void deleteEtudiant(int id) {
	    	EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	        EntityTransaction et = null;
	        Etudiant etud = null;
	 
	        try {
	            et = em.getTransaction();
	            et.begin();
	            etud = em.find(Etudiant.class, id);
	            em.remove(etud);
	            et.commit();
	        } catch (Exception ex) {
	            // If there is an exception rollback changes
	            if (et != null) {
	                et.rollback();
	            }
	            ex.printStackTrace();
	        } finally {
	            // Close EntityManager
	            em.close();
	        }
	    }
}
