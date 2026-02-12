package org.yourcompany.yourproject;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Socio> socios = new ArrayList<>();
    private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();

    public Biblioteca (){}

    public ArrayList<Socio> darSocios(){
        return socios;
    }

    public ArrayList<Bibliotecario> darBibliotecario(){
        return bibliotecarios;
    }

    public void AgregarSocio(Socio socio){
        socios.add(socio);
    }

    public void AgregarBibliotecario(Bibliotecario bibliotecario){
        bibliotecarios.add(bibliotecario);
    }
}
