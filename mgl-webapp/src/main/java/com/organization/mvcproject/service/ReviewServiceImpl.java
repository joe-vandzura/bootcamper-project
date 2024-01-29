package com.organization.mvcproject.service;

import com.organization.bootcamp.mvcproject.api.dao.ReviewDao;
import com.organization.bootcamp.mvcproject.api.service.ReviewService;
import com.organization.bootcamp.mvcproject.api.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewDao reviewDao;


    @Override
    public List<Review> retrieveAllReviews() {
        return null;
    }

    @Override
    public Review saveReview(Review review) {
        return reviewDao.saveReview(review);
    }

    @Override
    public Boolean updateReview(Review review) {
        return null;
    }

    @Override
    public Boolean deleteReview(Review review) {
        return null;
    }

    @Override
    public Review findById(Long id) {
        return reviewDao.findById(id);
    }
}
