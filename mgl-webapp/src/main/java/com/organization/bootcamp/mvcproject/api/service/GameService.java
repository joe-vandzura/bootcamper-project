package com.organization.bootcamp.mvcproject.api.service;

import java.util.List;

import com.organization.mvcproject.model.GameImpl;

public interface GameService {

	List<GameImpl> retrieveAllGames();

	GameImpl saveGame(GameImpl game);

	Boolean updateGame(GameImpl game);

	Boolean deleteGame(GameImpl game);

	GameImpl findById(Long id);

}
