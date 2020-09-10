package com.pack.SuperAdmin;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name="superadmin")
public class SuperAdmin implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="SuperAdminName",unique=true)
	private String SuperAdminName;
	
	@Column(name="SuperAdminMDP",nullable=false)
	private String SuperAdminMDP;
	
	public String getSuperAdminName()
	{
		return SuperAdminName;
	}
	public String getSuperAdminMDP()
	{
		return SuperAdminMDP;
	}
	public void setSuperAdminName(String SuperAdminName)
	{
		this.SuperAdminName=SuperAdminName;
	}
	public void setSuperAdminMDP(String SuperAdminMDP)
	{
		this.SuperAdminMDP=SuperAdminMDP;
	}
}