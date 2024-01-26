package com.organization.bootcamp.mvcproject.api.service;

import com.organization.mvcproject.model.GameImpl;
import com.organization.mvcproject.model.ReviewImpl;

import java.util.List;

public interface ReviewService {

    List<ReviewImpl> retrieveAllReviews();

    ReviewImpl saveReview(ReviewImpl review);

    Boolean updateReview(ReviewImpl review);

    Boolean deleteReview(ReviewImpl review);

    ReviewImpl findById(Long id);

}
