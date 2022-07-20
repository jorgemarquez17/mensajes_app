package com.platzi.mensajes_app;

import java.util.Scanner;

public class mensajesService {

    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Escribe tu Nombre");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutorMEnsaje(nombre);
        MensajesDAO.crearMensajeDB(registro);
    }
    public static void listarMensaje(){

    }
    public static void borrarMensaje(){

    }
    public static void editarMensaje(){

    }
}
