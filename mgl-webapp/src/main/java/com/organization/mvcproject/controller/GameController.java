package com.organization.mvcproject.controller;

import java.util.List;

import com.organization.mvcproject.service.GameServiceImpl;
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
	private GameServiceImpl gameService;


	//TODO 1.0 RequestMapping URL should follow RESTful.
	@GetMapping(value = "/getAll")
	public ResponseEntity<List<GameImpl>> fetchAllGames() {
		return new ResponseEntity<List<GameImpl>>(gameService.retrieveAllGames(), HttpStatus.OK);
	}

	//TODO 1.0 RequestMapping URL should follow RESTful convention
	@PostMapping(value = "/createGame", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> createGame(@RequestBody GameImpl game) {
		gameService.saveGame(game);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PutMapping(value = "/updateGame", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateGame(@RequestBody GameImpl game) {
		gameService.updateGame(game);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PostMapping(value = "/deleteGame", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteGame(@RequestBody Long gameId) {
		GameImpl game = gameService.findById(gameId);
		gameService.deleteGame(game);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}