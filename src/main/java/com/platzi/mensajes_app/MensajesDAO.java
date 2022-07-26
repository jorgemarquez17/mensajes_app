package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {

    public static Connection getConnection(){
        Conexion db_connect = new Conexion();
        return db_connect.get_connection();
    }

    public static void crearMensajeDB(Mensajes mensaje){
        try (Connection conexion = getConnection()){
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO mensaje( mensaje, autor_mensaje) VALUES (?,?)";
                ps= conexion.prepareStatement(query);
                ps.setString(1,mensaje.getMensaje());
                ps.setString(2,mensaje.getAutorMEnsaje());
                ps.executeUpdate();
                System.out.println("Mensaje Creado");
            }catch (SQLException ex){
                System.out.println("No se pudo crear el mensaje");
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerMensajeDB(){
            try(Connection conexion = getConnection()){
                PreparedStatement ps = null;
                ResultSet rs = null;
                try {
                    String query = "SELECT * FROM mensaje";
                    ps = conexion.prepareStatement(query);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        System.out.println("ID: " + rs.getInt("id_mensaje"));
                        System.out.println("Mensaje: " + rs.getString("mensaje"));
                        System.out.println("Autor-Mensaje: " + rs.getString("autor_mensaje"));
                        System.out.println("Fecha-Mensaje: " + rs.getTimestamp("fecha_mensaje"));
                    }
                }catch (SQLException e){
                    System.out.println("No se pudieron recuperar los mensajes");
                    System.out.println(e);
                }
            }catch (SQLException ex){
                System.out.println(ex);
            }
    }
    public static void borrarMensajeDB(int Id_mensaje){

        PreparedStatement ps = null;
        try(Connection conexion = getConnection()){
            try {
                String query = "DELETE  FROM  mensaje WHERE id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1, Id_mensaje);
                ps.executeUpdate();
                System.out.println("Mensaje Borrado");
            }catch (SQLException e){
                System.out.println("No se pudo borrar el mensaje");
                System.out.println(e);
            }
        }catch (SQLException ex){
            System.out.println(ex);
        }

    }
    public static void actualizarMensjeDB(Mensajes mensaje){
        try (Connection conexion = getConnection()){
            PreparedStatement ps = null;
            try {
                String query = "UPDATE mensaje set mensaje = ? , autor_mensaje = ? where id_mensaje = ? ";
                ps= conexion.prepareStatement(query);
                ps.setString(1,mensaje.getMensaje());
                ps.setString(2,mensaje.getAutorMEnsaje());
                ps.setInt(3,mensaje.getId_mensaje());
                ps.executeUpdate();
                System.out.println("Mensaje Editado");
            }catch (SQLException ex){
                System.out.println("Ocurrio un error al actualizar el mensaje");
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
