/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tarea_v_card.models.domain;

import org.springframework.stereotype.Component;

/**
 *
 * @author Usuario
 */
@Component
public class Empleado {

    //Atributos
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;
    private String cargo;
    private String imgUser;

    //Metodos Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getImgUser() {
        return imgUser;
    }

    public void setImgUser(String imgUser) {
        this.imgUser = imgUser;
    }

    //Constructores
    public Empleado(String nombre, String apellido, String correo, String celular, String cargo, String imgUser) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
        this.cargo = cargo;
        this.imgUser = imgUser;
    }

    public Empleado() {
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", celular=" + celular + ", cargo=" + cargo + ", imgUser=" + imgUser + '}';
    }

    
}
