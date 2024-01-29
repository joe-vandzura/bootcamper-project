package com.organization.bootcamp.mvcproject.api.dao;

import com.organization.bootcamp.mvcproject.api.model.Game;

import java.util.List;

public interface GameDao {
    List<Game> retrieveAllGames();

    Game saveGame(Game game);

    Boolean updateGame(Game game);;

    Boolean deleteGame(Game game);

    Game findById(Long id);

}
