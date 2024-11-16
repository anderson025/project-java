package com.cursojava.projetojava.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursojava.projetojava.dto.GameDTO;
import com.cursojava.projetojava.dto.GameListDTO;
import com.cursojava.projetojava.dto.GameMinDTO;
import com.cursojava.projetojava.entities.Game;
import com.cursojava.projetojava.entities.GameList;
import com.cursojava.projetojava.repositories.GameListRepository;



@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
}
