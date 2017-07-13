package com.captton.alumnos;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private int edad;
	private int materiasAprobadas;
	private static String colegio;
	private static int count=0;
	
	public Alumno()
	{		
	}
	
	public Alumno(String nom, String ape, int ed)
	{
	  this.nombre = nom;
	  this.apellido = ape;
	  this.edad = ed;
	  this.materiasAprobadas=0;
	  this.count++;
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

	public static String getColegio() {
		return colegio;
	}

	public static void setColegio(String colegio) {
		Alumno.colegio = colegio;
	}
	
	

	public int getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public void setMateriasAprobadas(int materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Alumno.count = count;
	}
	
	public void aproboUnaMateria()
	{
		this.materiasAprobadas++;
	}
	
	

	
	
	
}
