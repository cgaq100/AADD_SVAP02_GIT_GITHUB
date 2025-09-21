package es.ciudadescolar.utils;

public class MessageManager {
    public static void EscribirMensaje(){
        System.out.println("Empezamos a usar Repositorios de Código...");
        System.out.println("Usuario => " + System.getProperty("user.name").toUpperCase());
    }
}
