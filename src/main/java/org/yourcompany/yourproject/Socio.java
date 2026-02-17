package org.yourcompany.yourproject;

public class Socio extends Usuario{
    private int limiteEjemplares;
    private int ejemplaresEnPrestamo;
    private double multasPendientes;

    public Socio(String id, String nombre, String email, int limiteEjemplares) {
        super(id, nombre, email);
        this.limiteEjemplares = limiteEjemplares;
        ejemplaresEnPrestamo = 0;
        multasPendientes = 0;
    }

    public void registrarPrestamo(int cantidad){
        boolean b = puedePedirPrestamo(cantidad);
        if (b == false){
            throw new IllegalArgumentException("No puede pedir un Prestamo");
        }else{
            ejemplaresEnPrestamo= ejemplaresEnPrestamo + cantidad;
            System.out.println("Tiene en prestamo "+ ejemplaresEnPrestamo +" libros" );
        }
    }

    public boolean puedePedirPrestamo (int cantidad){
        if (cantidad > limiteEjemplares || multasPendientes > 0){
            return false;
        }else {
            return true;
        }
    }

    public void agregarMulta (double monto){
        multasPendientes = multasPendientes + monto;
    }



}
