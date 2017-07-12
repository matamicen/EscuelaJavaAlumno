package com.captton.principal;

import com.captton.alumnos.Alumno;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno alu;
		alu = new Alumno("Gaston", "Perez", 23);
		alu.setNombre("Pepe");
		System.out.println("Ok.");
		System.out.println(alu.getNombre());

	}

}
