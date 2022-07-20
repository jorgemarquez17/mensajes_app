package com.platzi.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args){
        System.out.println("Hola mundo!");

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do{
            System.out.println("-----------");
            System.out.println(" Aplicacion de mensajes ");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("5. Salir");

            switch (opcion){
                case 1:
                    mensajesService.crearMensaje();
                    break;
                case 2:
                    mensajesService.listarMensaje();
                    break;
                case 3:
                    mensajesService.borrarMensaje();
                    break;
                case 4:
                    mensajesService.editarMensaje();
                    break;
                default:
                    break;
            }
            opcion = sc.nextInt();

        }while(opcion !=5);
    }
}
