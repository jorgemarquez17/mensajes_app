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
        MensajesDAO.leerMensajeDB();
    }
    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el id del mensaje que desea borrar");
        int idMensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(idMensaje);
    }
    public static void editarMensaje(){

        Scanner scInt = new Scanner(System.in);
        System.out.println("Escribe el id del mensaje que deseas borrar");
        int id_mensaje = scInt.nextInt();

        Scanner scString = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = scString.nextLine();

        System.out.println("Escribe tu Nombre");
        String nombre = scString.nextLine();

//        System.out.println("Escribe el id del mensaje que deseas borrar");
//        int id_mensaje = sc.nextInt();

        Mensajes registroUpdate = new Mensajes();
        registroUpdate.setId_mensaje(id_mensaje);
        registroUpdate.setMensaje(mensaje);
        registroUpdate.setAutorMEnsaje(nombre);
//        registroUpdate.setId_mensaje(id_mensaje);
        MensajesDAO.actualizarMensjeDB(registroUpdate);
    }
}
