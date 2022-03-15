package com.pagina.paginaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class indexController {
    @RequestMapping("/index")
    public String lenguaje(Model model){
        Set<String> lenguajesDP =new HashSet<String>();
        lenguajesDP.add("HTML");
        lenguajesDP.add("CSS");
        lenguajesDP.add("JAVASCRIPT");
        lenguajesDP.add("JAVA");
        model.addAttribute("lenguajes",lenguajesDP);
        return "index";
    }
}
