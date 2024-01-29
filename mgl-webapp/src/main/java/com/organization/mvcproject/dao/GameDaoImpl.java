package com.organization.mvcproject.dao;

import com.organization.bootcamp.mvcproject.api.dao.GameDao;
import com.organization.bootcamp.mvcproject.api.model.Game;
import com.organization.mvcproject.model.GameImpl;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class GameDaoImpl implements GameDao {

    private static Long gameId = new Long(0);
    private static Long companyId = new Long(0);
    private static List<Game> games = new ArrayList<>();

    static {
        games = populateGames();
    }

    private static List<Game> populateGames() {

        Game game1 = new GameImpl();
        game1.setId(++gameId);
        game1.setGenre("Sport");
        game1.setName("Rocket League");

        Game game2 = new GameImpl();
        game2.setId(++gameId);
        game2.setGenre("Shooter");
        game2.setName("Halo 3");

        Game game3 = new GameImpl();
        game3.setId(++gameId);
        game3.setGenre("MMORPG");
        game3.setName("Runescape");

        games.add(game1);
        games.add(game2);
        games.add(game3);

        return games;
    }

    @Override
    public List<Game> retrieveAllGames() {
        return games;
    }

    @Override
    public Game saveGame(Game game) {
        game.setId(++gameId);
        games.add(game);
        return game;
    }

    @Override
    public Boolean updateGame(Game game) {
        for (int i = 0; i < games.size(); i++) {
            if (game.getName().equals(games.get(i).getName())) {
                games.set(i, game);
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean deleteGame(Game game) {
        return games.remove(game);
    }

    @Override
    public Game findById(Long id) {
        for (Game game : games) {
            if (game.getId().equals(id)) {
                return game;
            }
        }
        return null;
    }

}
