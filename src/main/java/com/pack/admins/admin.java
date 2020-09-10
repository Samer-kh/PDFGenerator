package com.pack.admins;
import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="admins")
public class admin implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="AdminID",unique=true)
	private int AdminID;
	@Column(name="AdminName",nullable=false)
	private String AdminName;
	
	@Column(name="AdminMDP",nullable=false)
	private String AdminMDP;
	
	public int getAdminID()
	{
		return AdminID;
	}
	
	public String getAdminName()
	{
		return AdminName;
	}
	public String getAdminMDP()
	{
		return AdminMDP;
	}
	public void setAdminName(String AdminName)
	{
		this.AdminName=AdminName;
	}
	public void setAdminMDP(String AdminMDP)
	{
		this.AdminMDP=AdminMDP;
	}
}
