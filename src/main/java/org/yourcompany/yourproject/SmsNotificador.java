package org.yourcompany.yourproject;

public class SmsNotificador implements Notificador{

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviando EMAIL a " + destino);
        System.out.println("Mensaje: " + mensaje);
    }
}
