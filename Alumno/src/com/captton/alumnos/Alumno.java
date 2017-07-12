package com.captton.alumnos;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public Alumno()
	{		
	}
	
	public Alumno(String nom, String ape, int ed)
	{
	  this.nombre = nom;
	  this.apellido = ape;
	  this.edad = ed;
	}

	public void setNombre(String nom)
	{
		this.nombre = nom;
	}
	
	public void setApellido(String ape)
	{
		this.apellido = ape;
	}
	
	public void setEdad(int ed)
	{
		this.edad = ed;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	
}
