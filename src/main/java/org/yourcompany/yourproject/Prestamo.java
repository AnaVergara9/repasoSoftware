
package org.yourcompany.yourproject;

import java.util.ArrayList;

public class Prestamo {

    private Socio socio;
    private ArrayList<Ejemplar> ejemplares = new ArrayList<>();

    public Prestamo(Socio socio, ArrayList<Ejemplar> ejemplares) {
        this.socio = socio;
        this.ejemplares = ejemplares;
    }

    public void notificarCreacion(Notificador notificador){
        String mensaje = "Se ha creado su préstamo con " + ejemplares.size() + " ejemplares.";
        notificador.enviar(socio.getEmail(), mensaje);
    }
    

}