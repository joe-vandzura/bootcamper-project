package com.organization.bootcamp.mvcproject.api.service;

import java.util.List;

import com.organization.bootcamp.mvcproject.api.model.Game;
import com.organization.mvcproject.model.GameImpl;

public interface GameService {

	List<Game> retrieveAllGames();

	Game saveGame(Game game);

	Boolean updateGame(Game game);

	Boolean deleteGame(Game game);

	Game findById(Long id);

}
