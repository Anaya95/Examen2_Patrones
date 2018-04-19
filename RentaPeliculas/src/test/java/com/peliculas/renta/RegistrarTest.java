package com.peliculas.renta;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegistrarTest {

	@Test
	public void testAddPelicula() {
		Pelicula peli = new Pelicula("Terminator",0);
		Registrar.addPelicula(peli);
		assertEquals(Registrar.getPelicula("Terminator"),peli);
	}
	
	@Test
	public void testAddCliente() {
		Cliente cliente = new Cliente("Erick Anaya");
		Registrar.addCliente(cliente);
		assertEquals(Registrar.getCliente("Erick Anaya"),cliente);
	}
}
