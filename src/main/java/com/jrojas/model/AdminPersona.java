package com.jrojas.model;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminPersona {

	@Autowired
	PersonaImp p;
	
	Logger log= Logger.getLogger(AdminPersona.class.toString());
	
	public void hola() {
		p.setEdad(18);
		log.info(""+p.getEdad());
	}
}
