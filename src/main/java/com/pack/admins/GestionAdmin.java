package com.pack.admins;
import java.util.List;

import javax.persistence.*;








public class GestionAdmin {
private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("adminGUI");
	
	/*public static void main (String[] args)
	{
		admin ad=new admin();
		
		ad=getAdmin("samer");
		System.out.println(ad.getAdminMDP());
		ENTITY_MANAGER_FACTORY.close();
	}*/
	public GestionAdmin()
	{
		
	}

	public static void addAdmin(String AdminName,String AdminMDP)
	{
		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et=null;
		try
		{
		et=em.getTransaction();
		et.begin();
		admin admin=new admin();
		admin.setAdminName(AdminName);
		admin.setAdminMDP(AdminMDP);
		em.persist(admin);
		et.commit();}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			em.close();
		}
	}
	
	
	public static admin getAdmin(String adminName)
	{
		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		admin ad =new admin();		
		String Query="SELECT a FROM admin a WHERE a.AdminName =: Name";
		TypedQuery<admin> tq=em.createQuery(Query, admin.class);
				tq.setParameter("Name",adminName);
		try
		{
			
			ad=tq.getSingleResult();
			//System.out.println("le resultat est trouvé");
			em.close();
			return ad;
		}
		catch(Exception e)
		{
			System.out.println("Erreur");
			e.printStackTrace();
			em.close();
			return null;
		}
	
	}
	
	
	public static void updateAdmin(int ID ,String AdminName,String AdminMDP)
	{
		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et=null;
		admin admin=new admin();
		try
		{
		et=em.getTransaction();
		et.begin();
		
		admin=em.find(admin.class,ID);
		
		
			admin.setAdminMDP(AdminMDP);
			admin.setAdminName(AdminName);
			em.persist(admin);
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
	
	public static void removeAdmin(int ID ,String AdminName,String AdminMDP)
	{
		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et=null;
		try
		{
			et=em.getTransaction();
			et.begin();
			admin admin1=new admin();
			admin1=em.find(admin.class,ID);
			
			
				em.remove(admin1);
				
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
	public static List<admin> getAdmins()
	{

		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		String strQuery="SELECT e FROM admin e WHERE e.AdminName IS NOT NULL "	;
		TypedQuery<admin> tq=em.createQuery(strQuery, admin.class);
		List<admin> L=null;
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
	public static List<admin> getAdmins(String AdminName)
	{

		EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
		String strQuery="SELECT e FROM admin e WHERE e.AdminName =: AdminName "	;
		TypedQuery<admin> tq=em.createQuery(strQuery, admin.class);
		List<admin> L=null;
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
}}