
package com.example.videojuegos.Repository;

import com.example.videojuegos.domain.VideoJuego;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VideojuegoRepository extends JpaRepository<VideoJuego,Integer>{
    
}
