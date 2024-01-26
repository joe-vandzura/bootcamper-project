package com.organization.bootcamp.mvcproject.api.dao;

import com.organization.bootcamp.mvcproject.api.model.Review;
import com.organization.mvcproject.model.ReviewImpl;

import java.util.List;

public interface ReviewDao {

    List<ReviewImpl> retrieveAllReviews();

    ReviewImpl saveReview(ReviewImpl review);

    Boolean updateReview(ReviewImpl review);;

    Boolean deleteReview(ReviewImpl review);

    ReviewImpl findById(Long id);
}
