
package com.organization.mvcproject.model;

import com.organization.bootcamp.mvcproject.api.model.Company;

import java.util.List;

public class CompanyImpl implements Company {

	private Long id;
	private String name;
	private List<GameImpl> gamesMade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<GameImpl> getGamesMade() {
		return gamesMade;
	}

	public void setGamesMade(List<GameImpl> gamesMade) {
		this.gamesMade = gamesMade;
	}
}