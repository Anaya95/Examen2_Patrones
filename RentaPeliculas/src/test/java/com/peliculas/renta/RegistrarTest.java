package com.peliculas.renta;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegistrarTest {

	@Test
	public void testAdd1() {
		Pelicula peli = new Pelicula("Terminator",0);
		Registrar.add("Peliculas", peli);
		assertEquals(Registrar.get("Peliculas","Terminator"),peli);
	}
	
	@Test
	public void testAdd2() {
		Cliente cliente = new Cliente("Erick Anaya");
		Registrar.add("Clientes", cliente);
		assertEquals(Registrar.get("Clientes","Erick Anaya"),cliente);
	}
}
