package com.organization.provider.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="NAME")
	private String name;
	
	@OneToMany
	private List<GameImpl> gamesMade = new ArrayList<GameImpl>();

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