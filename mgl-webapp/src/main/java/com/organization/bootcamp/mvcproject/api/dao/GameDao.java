package com.organization.bootcamp.mvcproject.api.dao;

import com.organization.mvcproject.model.GameImpl;

import java.util.List;

public interface GameDao {
    List<GameImpl> retrieveAllGames();

    GameImpl saveGame(GameImpl game);

    Boolean updateGame(GameImpl game);;

    Boolean deleteGame(GameImpl game);

    GameImpl findById(Long id);
}
