package org.yourcompany.yourproject;

import java.util.ArrayList;

public class Libro {
    private String isbn;
    private String titulo;
    private ArrayList<Ejemplar> ejemplares = new ArrayList<>();

    public Libro(String isbn, String titulo,ArrayList<Ejemplar> ejemplares) {
        this.isbn = isbn;
        this.titulo =titulo;
        this.ejemplares = ejemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public Ejemplar crearEjemplar(String codigo){
        Ejemplar ejemplar = new Ejemplar(codigo,this);
    }
}
