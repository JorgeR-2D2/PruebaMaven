package com.jrojas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jrojas.model.AdminPersona;

@SpringBootTest
class PruebaModelosApplicationTests {

	@Autowired
	AdminPersona a;
	
	@Test
	void contextLoads() {
		a.hola();
	}

}
