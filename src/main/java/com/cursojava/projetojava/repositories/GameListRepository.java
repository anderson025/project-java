package com.cursojava.projetojava.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.projetojava.entities.Game;
import com.cursojava.projetojava.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
