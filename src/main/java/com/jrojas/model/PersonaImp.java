package com.jrojas.model;

import org.springframework.stereotype.Component;

@Component
public class PersonaImp implements Persona {
	
	private String nombre;
	private int edad;
	
	public PersonaImp() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
