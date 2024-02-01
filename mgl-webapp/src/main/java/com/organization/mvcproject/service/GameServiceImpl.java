package com.organization.mvcproject.service;

import java.util.List;

import com.organization.bootcamp.mvcproject.api.service.GameService;
import com.organization.bootcamp.mvcproject.api.dao.GameDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.bootcamp.mvcproject.api.model.Game;

@Service("gameService")
public class GameServiceImpl implements GameService {

	@Autowired
	private GameDao gameDao;

	@Override
	public List<Game> retrieveAllGames() {
		return gameDao.retrieveAllGames();
	}

	@Override
	public Game saveGame(Game game) {
		List<Game> allGames = retrieveAllGames();
		boolean updated = false;
		for (int i = 0; i < allGames.size(); i++) {
			if (game.getName().equals(allGames.get(i).getName())) {
				game.setId(allGames.get(i).getId());
				updated = updateGame(game);
			}
		}
		if (!updated) {
			gameDao.saveGame(game);
		}
		return game;
	}

	@Override
	public Boolean updateGame(Game game) {
		return gameDao.updateGame(game);
	}

	@Override
	public Boolean deleteGame(Game game) {
		return gameDao.deleteGame(game);
	}

	@Override
	public Game findById(Long id) {
		return gameDao.findById(id);
	}
}