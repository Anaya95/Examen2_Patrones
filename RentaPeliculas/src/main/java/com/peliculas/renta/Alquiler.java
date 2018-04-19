package com.peliculas.renta;

public class Alquiler {
    private Pelicula peli;
    private int diasAlquilado;
    
    public Alquiler(Pelicula peli, int pDiasAlquilado) {
    	this.peli = peli;
    	diasAlquilado = pDiasAlquilado;
    }
    
    public int getDiasAlquilado() {
    	return diasAlquilado;
    }
    public Pelicula getPelicula() {
    	return peli;
    }
}