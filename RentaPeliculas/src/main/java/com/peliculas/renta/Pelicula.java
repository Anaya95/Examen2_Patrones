package com.peliculas.renta;

public class Pelicula {
		public static final int  INFANTIL = 2;
	    public static final int  NORMAL = 0;
	    public static final int  ESTRENO = 1;

	    private String nombre; 
		private int tipoCobro;

		public Pelicula(String nombre, int tipoCobro) {
			this.nombre = nombre;
			this.tipoCobro = tipoCobro;
		}

		public int getTipoCobro() {
			return tipoCobro;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
}
