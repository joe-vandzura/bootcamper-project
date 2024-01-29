package com.organization.mvcproject.controller;

import java.util.List;

import com.organization.bootcamp.mvcproject.api.model.Game;
import com.organization.bootcamp.mvcproject.api.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.organization.mvcproject.model.GameImpl;

@Controller
@RequestMapping("/games")
public class GameController {

	@Autowired
	private GameService gameService;


	//TODO 1.0 RequestMapping URL should follow RESTful.
	@GetMapping(value = "/getAll")
	public ResponseEntity<List<Game>> fetchAllGames() {
		return new ResponseEntity<List<Game>>(gameService.retrieveAllGames(), HttpStatus.OK);
	}

	//TODO 1.0 RequestMapping URL should follow RESTful convention
	@PostMapping(value = "/createGame", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> createGame(@RequestBody GameImpl game) {
		gameService.saveGame(game);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping(value = "/updateGame", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateGame(@RequestBody Game game) {
		gameService.updateGame(game);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PostMapping(value = "/deleteGame", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteGame(@RequestBody Long gameId) {
		Game game = gameService.findById(gameId);
		gameService.deleteGame(game);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}