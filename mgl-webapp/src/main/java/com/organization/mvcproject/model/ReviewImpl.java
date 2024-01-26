package com.organization.mvcproject.model;

import com.organization.bootcamp.mvcproject.api.model.Review;

public class ReviewImpl implements Review {

	private Long id;
	private String body;
	private String author;
	private Integer rating;

	private Long gameId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId (Long gameId) {
		this.gameId = gameId;
	}
}
