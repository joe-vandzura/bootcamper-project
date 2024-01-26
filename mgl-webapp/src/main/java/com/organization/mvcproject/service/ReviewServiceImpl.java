package com.organization.mvcproject.service;

import com.organization.bootcamp.mvcproject.api.service.ReviewService;
import com.organization.mvcproject.dao.ReviewDaoImpl;
import com.organization.mvcproject.model.ReviewImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewDaoImpl reviewDao;


    @Override
    public List<ReviewImpl> retrieveAllReviews() {
        return null;
    }

    @Override
    public ReviewImpl saveReview(ReviewImpl review) {
        return reviewDao.saveReview(review);
    }

    @Override
    public Boolean updateReview(ReviewImpl review) {
        return null;
    }

    @Override
    public Boolean deleteReview(ReviewImpl review) {
        return null;
    }

    @Override
    public ReviewImpl findById(Long id) {
        return reviewDao.findById(id);
    }
}
