package com.organization.bootcamp.mvcproject.api.dao;

import com.organization.bootcamp.mvcproject.api.model.Review;

import java.util.List;

public interface ReviewDao {

    List<Review> retrieveAllReviews();

    Review saveReview(Review review);

    Boolean updateReview(Review review);;

    Boolean deleteReview(Review review);

    Review findById(Long id);
}
