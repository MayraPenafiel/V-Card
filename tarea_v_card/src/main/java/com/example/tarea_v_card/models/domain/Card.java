/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tarea_v_card.models.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author Usuario
 */
@Component
public class Card {

    //Atributos
    @Value("${card.titulo}")
    private String titulo;
    @Value("${card.empresa}")
    private String empresa;
    @Value("${card.correoEmpresa}")
    private String correoEmpresa;
    @Value("${card.direccion}")
    private String direccion;
    @Autowired
    private List<Empleado> empleados;

    //Metodos Getter y Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCorreoEmpresa() {
        return correoEmpresa;
    }

    public void setCorreoEmpresa(String correoEmpresa) {
        this.correoEmpresa = correoEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

   

    //Contructores
    public Card(String titulo, String empresa, String correoEmpresa, String direccion, List<Empleado> empleados) {
        this.titulo = titulo;
        this.empresa = empresa;
        this.correoEmpresa = correoEmpresa;
        this.direccion = direccion;
        this.empleados = empleados;
    }

    public Card() {
    }

    @Override
    public String toString() {
        return "Card{" + "titulo=" + titulo + ", empresa=" + empresa + ", correoEmpresa=" + correoEmpresa + ", direccion=" + direccion + ", empleados=" + empleados + '}';
    }

   

}
