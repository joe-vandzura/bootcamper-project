package com.organization.mvcproject.service;

import java.util.List;

import com.organization.bootcamp.mvcproject.api.service.GameService;
import com.organization.mvcproject.dao.GameDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.mvcproject.model.GameImpl;

@Service("gameService")
public class GameServiceImpl implements GameService {

	@Autowired
	private GameDaoImpl gameDao;

	@Override
	public List<GameImpl> retrieveAllGames() {
		return gameDao.retrieveAllGames();
	}

	@Override
	public GameImpl saveGame(GameImpl game) {
		return gameDao.saveGame(game);
	}

	@Override
	public Boolean updateGame(GameImpl game) {
		return gameDao.updateGame(game);
	}

	@Override
	public Boolean deleteGame(GameImpl game) {
		return gameDao.deleteGame(game);
	}

	@Override
	public GameImpl findById(Long id) {
		return gameDao.findById(id);
	}
}