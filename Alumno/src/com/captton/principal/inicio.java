package com.captton.principal;

import com.captton.alumnos.Alumno;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno.setColegio("Normal 36");
		
		Alumno alu;
		//Alumno.colegio = "ORT II";
		
		
		alu = new Alumno("Gaston", "Perez", 23);
		
		alu.setNombre("Pepe");
		System.out.println("Ok.");
		System.out.println(alu.getNombre() + "Colegio:" + alu.getColegio());
		
		
		
		Alumno alu2;
		alu2 = new Alumno("Gimena", "Roldan", 19);
		
		System.out.println("Ok.");
		System.out.println(alu2.getNombre() + "Colegio: " + alu2.getColegio());
		
		alu2.aproboUnaMateria();
		alu2.aproboUnaMateria();
		System.out.println("El alumno"+ alu2.getNombre() + "Aprobo: " + alu2.getMateriasAprobadas() + " Materias");
		
		
		System.out.println("la cantidad de alumnos dado de alta son:" + Alumno.getCount());


	}

}
