package com.pack.adminGUI;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="etudiants")
public class Etudiant implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@Column (name="id",unique=true)
	private int id;
	

	@Column (name="InscID",nullable=false)
	private String InscID;
	

	@Column (name="FName",nullable=false)
	private String FName;
	

	@Column (name="LName",nullable=false)
	private String LName;
	

	
	@Column (name="CIN",nullable=false)
	private String CIN;
	
	public int getID()
	{return id;}
	public String getInscID()
	{return InscID;}
	public String getFName()
	{return FName;}
	public String getLName()
	{return LName;}
	public String getCIN()
	{return CIN;}
	
	public void setID(int id)
	{this.id=id;}
	public void setInscID(String InscID)
	{this.InscID=InscID;}
	public void setFName(String FName)
	{this.FName=FName;}
	public void setLName(String LName)
	{this.LName=LName;}
	public void setCIN(String CIN)
	{this.CIN=CIN;}
	
}
