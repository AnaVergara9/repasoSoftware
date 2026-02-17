/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

/**
 *
 * @author anaso
 */
public class Main {
    public static void main (String[]args){
        Biblioteca biblioteca = new Biblioteca();

        Bibliotecario bibliotecario = new Bibliotecario("1", "pepe","pepe@gmail.com","Mañana");

        biblioteca.addBibliotecario(bibliotecario);

        Socio socio = new Socio("2","Juan","juan@gmail.com",5);

        biblioteca.addSocio(socio);

        Libro libro = new Libro("1345","Fundamentos");

        biblioteca.addLibro(libro);

        libro.crearEjemplar("E001");

        System.out.println(biblioteca.getSocios().get(0).getNombre());
    }

}
