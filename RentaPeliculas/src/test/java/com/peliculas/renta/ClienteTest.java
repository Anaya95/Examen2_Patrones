package com.peliculas.renta;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {
	
	Cliente cliente = new Cliente("Erick Anaya");
	Alquiler alq = new Alquiler(2);

	@Test    
	public void testGetNombre() {
		assertEquals(cliente.getNombre(),"Erick Anaya");
	}
    
	@Test  
    public void testGetAlquiler() {
		cliente.setAlquiler(alq);
		assertEquals(cliente.getAlquiler(),alq);
    }
}
