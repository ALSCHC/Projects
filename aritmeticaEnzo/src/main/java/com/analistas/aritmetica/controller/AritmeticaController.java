/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.aritmetica.controller;

import com.analistas.aritmetica.model.Aritmetica;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Alumno
 */
@Controller
public class AritmeticaController {
    
    @GetMapping({"/","/index"})
    public String index(Model m){
      
        m.addAttribute("aritmetica", new Aritmetica());
        m.addAttribute("txtRes", 0.00);
        
        return "index";
    }
    @PostMapping("/index")
    public String resultado(@ModelAttribute Aritmetica aritmetica, Model m){
        
        aritmetica.sumar();
        
        m.addAttribute("txtRes", "Resultado: " + aritmetica.sumar());
        
        
        return "index";
    }
}
