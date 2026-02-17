package org.yourcompany.yourproject;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Socio> socios = new ArrayList<>();
    private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();
    private ArrayList<Libro> catalogo = new ArrayList<>();

    public Biblioteca (){}

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public ArrayList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void addSocio(Socio socio){
        socios.add(socio);
    }

    public void addBibliotecario(Bibliotecario bibliotecario){
        bibliotecarios.add(bibliotecario);
    }

    public void addLibro(Libro libro){catalogo.add(libro);}



}
