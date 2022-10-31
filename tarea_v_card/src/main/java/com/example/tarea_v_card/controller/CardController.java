/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tarea_v_card.controller;

import com.example.tarea_v_card.models.domain.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Usuario
 */
@Controller
@RequestMapping("/card")
public class CardController {
    
    @Autowired
    private Card card;

    @GetMapping("/ver")
    public String ver(Model model){
        model.addAttribute("card", card);
        model.addAttribute("titulo", "Card V");
        return "ver";
    }
}
