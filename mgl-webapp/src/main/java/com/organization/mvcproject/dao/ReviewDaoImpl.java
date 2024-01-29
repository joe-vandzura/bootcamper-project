package com.organization.mvcproject.dao;

import com.organization.bootcamp.mvcproject.api.dao.ReviewDao;
import com.organization.bootcamp.mvcproject.api.model.Review;
import com.organization.mvcproject.model.ReviewImpl;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ReviewDaoImpl implements ReviewDao {

    private static Long reviewId = new Long(0);
    private static Long gameId = new Long(0);
    private static List<Review> reviews = new ArrayList<Review>();

    static {
        reviews = populateReviews();
    }

    private static List<Review> populateReviews() {


        Review review1 = new ReviewImpl();
        review1.setId(++reviewId);
        review1.setAuthor("Random Person 1");
        review1.setBody("TERRIBLE");
        review1.setRating(1);
        review1.setGameId(1L);

        Review review2 = new ReviewImpl();
        review2.setId(++reviewId);
        review2.setAuthor("Random Person 2");
        review2.setBody("It's meh...");
        review2.setRating(3);
        review2.setGameId(2L);

        Review review3 = new ReviewImpl();
        review3.setId(++reviewId);
        review3.setAuthor("Random Person 3");
        review3.setBody("This game is AWESOME!");
        review3.setRating(5);
        review3.setGameId(3L);

        reviews.add(review1);
        reviews.add(review2);
        reviews.add(review3);

        return reviews;
    }
    @Override
    public List<Review> retrieveAllReviews() {
        return reviews;
    }

    @Override
    public Review saveReview(Review review) {
        review.setId(++reviewId);
        reviews.add(review);
        return review;
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
        for (Review review : reviews) {
            if (review.getId().equals(id)) {
                return review;
            }
        }
        return null;
    }
}
