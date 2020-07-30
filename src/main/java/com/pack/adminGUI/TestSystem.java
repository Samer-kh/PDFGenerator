package com.pack.adminGUI;

import java.util.List;
import javax.persistence.*;

public class TestSystem {

	 private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
	            .createEntityManagerFactory("adminGUI");
	
	

	
	public static void addEtudiant(int id , String InscID , String FName , String LName, String CIN)
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
			etud.setID(id);
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
				
		String Query="SELECT e FROM Etudiands WHERE e.id =: idEtudiant";
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
	
	public static List<Etudiant> getEtudiants()
	{
		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		String strQuery="SELECT e FROM Etudiants WHERE id IS NOT NULL "	;
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
}
