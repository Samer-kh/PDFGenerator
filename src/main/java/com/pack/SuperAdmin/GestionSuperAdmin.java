package com.pack.superadmin;

import com.pack.admins.Admin;

import javax.persistence.*;
import java.util.List;
import java.lang.String;





public class GestionSuperAdmin {
private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("SuperAdminGUI");
	
	/*public static void main (String[] args)
	{
		Admin ad=new Admin();
		
		ad=getAdmin("samer");
		System.out.println(ad.getAdminMDP());
		ENTITY_MANAGER_FACTORY.close();
	}*/
	public GestionSuperAdmin()
	{
		
	}

	
	
	
	public static SuperAdmin getSuperAdmin(String SuperAdminName)
	{
		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		SuperAdmin sad =new SuperAdmin();		
		String Query="SELECT a FROM SuperAdmin a WHERE a.SuperAdminName =: Name";
		TypedQuery<SuperAdmin> tq=em.createQuery(Query, SuperAdmin.class);
				tq.setParameter("Name",SuperAdminName);
		try
		{
			
			sad=tq.getSingleResult();
			//System.out.println("le resultat est trouvé");
			em.close();
			return sad;
		}
		catch(Exception e)
		{
			System.out.println("Erreur");
			e.printStackTrace();
			em.close();
			return null;
		}
	
	}
	
	
	public static boolean updateSuperAdmin(String SuperAdminName,String SuperAdminMDP, String SuperAdminNewMDP)
	{
		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et=null;
		try
		{
		et=em.getTransaction();
		et.begin();
		SuperAdmin SuperAdmin=new SuperAdmin();
		SuperAdmin=em.find(SuperAdmin.class,SuperAdminName);
		
		if (SuperAdmin.getSuperAdminMDP()==SuperAdminMDP)
		{
			SuperAdmin.setSuperAdminMDP(SuperAdminNewMDP);
			em.persist(SuperAdmin);
			et.commit();
			return true;
		}

		
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
		return false;
	}}
	
	