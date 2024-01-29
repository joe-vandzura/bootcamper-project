package com.organization.bootcamp.mvcproject.api.service;

import com.organization.bootcamp.mvcproject.api.model.Review;

import java.util.List;

public interface ReviewService {

    List<Review> retrieveAllReviews();

    Review saveReview(Review review);

    Boolean updateReview(Review review);

    Boolean deleteReview(Review review);

    Review findById(Long id);

}
