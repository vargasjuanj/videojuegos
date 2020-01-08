package com.example.videojuegos.controller.service;

import com.example.videojuegos.Repository.VideojuegoRepository;
import com.example.videojuegos.domain.VideoJuego;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideoJuegoService {

    private final VideojuegoRepository vjr;

    public VideoJuegoService(VideojuegoRepository vjr) {
        this.vjr = vjr;
    }

    public List<VideoJuego> buscarDestacados() {


        return vjr.findAll();
    }

   private void mostrar(List<VideoJuego> destacados) {
for (int i=0; i<destacados.size(); i++){
    System.out.println(destacados.get(i));
}      
       System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaafffffffffffffffffffffffffffffff");
    }


}
