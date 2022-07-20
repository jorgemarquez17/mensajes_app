package com.platzi.mensajes_app;

public class Mensajes {
    int id_mensaje;
    String mensaje;
    String autorMEnsaje;
    String fecha_mensaje;
    public Mensajes(){

    }

    public Mensajes( String mensaje, String autorMEnsaje, String fecha_mensaje) {
        this.mensaje = mensaje;
        this.autorMEnsaje = autorMEnsaje;
        this.fecha_mensaje = fecha_mensaje;
    }

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMEnsaje() {
        return autorMEnsaje;
    }

    public void setAutorMEnsaje(String autorMEnsaje) {
        this.autorMEnsaje = autorMEnsaje;
    }

    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }
}
