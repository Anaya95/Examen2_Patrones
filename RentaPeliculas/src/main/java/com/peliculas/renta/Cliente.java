package com.peliculas.renta;

public class Cliente {
	private String nombre;
	private Alquiler alquiler;
	
	public Cliente(String pNombre) {
        this.nombre = pNombre;
    }
    
	public String getNombre() {
		return nombre;
	}
    
    public Alquiler getAlquiler() {
    	return alquiler;
    }
    
    public void setAlquiler(Alquiler alquiler) {
    	this.alquiler = alquiler;
    }
}