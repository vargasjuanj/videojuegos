
package com.example.videojuegos.controller;

import com.example.videojuegos.controller.service.VideoJuegoService;
import com.example.videojuegos.domain.VideoJuego;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller

public class ListadoController {
private final VideoJuegoService vjs;

    public ListadoController(VideoJuegoService vjs) {
        this.vjs = vjs;
    }

    @RequestMapping("/")
    public String listarVideojuegos(Model model){
        //busqueda de videojuegos
        List<VideoJuego>destacados=vjs.buscarDestacados();
       
     model.addAttribute("videojuegos", destacados);

        return "listado";
    }

   
    
        }
   
     

