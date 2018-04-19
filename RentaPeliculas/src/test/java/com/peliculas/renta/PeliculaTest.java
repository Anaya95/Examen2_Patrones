package com.peliculas.renta;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeliculaTest {
	
	Pelicula peli = new Pelicula("Titanes del pacífico 2",1);
	
	@Test    
	public void testGetTipoCobro() {
		assertEquals(peli.getTipoCobro(),1);
	}
    
	@Test  
    public void testGetNombre() {
		assertEquals(peli.getNombre(),"Titanes del pacífico 2");
    }
}
