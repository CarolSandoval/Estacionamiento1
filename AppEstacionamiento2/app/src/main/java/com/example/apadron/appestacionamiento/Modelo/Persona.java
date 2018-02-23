package com.example.apadron.appestacionamiento.Modelo;



/**
 * Created by T420 on 22/02/2018.
 */

public class Persona {

    private String nombre;
    private int sapellidoPat;
    private String apellidoMat;
    private String correo;
    private String telefonoDepartamento;
    private String horaEntrada;
    private String horaSalida;
    private String licenciaConducir;

    public Persona(String nombre, int sapellidoPat, String apellidoMat, String correo, String telefonoDepartamento, String horaEntrada, String horaSalida, String licenciaConducir) {
        this.nombre = nombre;
        this.sapellidoPat = sapellidoPat;
        this.apellidoMat = apellidoMat;
        this.correo = correo;
        this.telefonoDepartamento = telefonoDepartamento;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.licenciaConducir = licenciaConducir;
    }


    public void registrarse(){

    }

    public void otorgarDatos(){

    }
}


