/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tarea_v_card;

import com.example.tarea_v_card.models.domain.Card;
import com.example.tarea_v_card.models.domain.Empleado;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Usuario
 */
@Configuration
public class AppConfig {

    @Bean("empleados")
    public List<Empleado> registrarItems() {

        Empleado e1 = new Empleado(
                "Mayra",
                "Peñafiel",
                "mayrapenafiel@gmail.com",
                "089448751",
                "Gerente General",
                "https://drive.google.com/file/d/1nfjmxKSItxePGK-bAeAzQQdqXWzPxWu5/view?usp=sharing");
        System.out.println(e1);
        Empleado e2 = new Empleado(
                "Amber",
                "Liu",
                "LimAmber@naver.com",
                "0979874561",
                "Ejecutivo Administrador",
                "");
        System.out.println(e2);
        Empleado e3 = new Empleado(
                "Kai",
                "Kim",
                "Kaibear@naver.com",
                "0987456321",
                "Gerente de Marketing",
                "");
        System.out.println(e3);
        return Arrays.asList(e1,e2,e3);
        
    }

}
