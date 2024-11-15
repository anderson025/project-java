package com.cursojava.projetojava.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.projetojava.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
