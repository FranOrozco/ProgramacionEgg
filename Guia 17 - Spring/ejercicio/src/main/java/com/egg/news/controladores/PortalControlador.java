package com.egg.news.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
/* Configura cuál va a ser la URL que va a escuchar a este controlador. 
Cada vez que pongamos en nuestro URL en el localhost, este controlador se va activar. */
public class PortalControlador {
    @GetMapping("/")
    public String index() {
        return "index.html";
    }
}
