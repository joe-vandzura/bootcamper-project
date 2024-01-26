package com.organization.bootcamp.mvcproject.api.model;

import com.organization.mvcproject.model.GameImpl;

public interface Review {

    Long getId();
    void setId(Long id);
    String getBody();
    void setBody(String body);
    String getAuthor();
    void setAuthor(String author);
    Integer getRating();
    void setRating(Integer rating);

    Long getGameId();

    void setGameId(Long gameId);

}
