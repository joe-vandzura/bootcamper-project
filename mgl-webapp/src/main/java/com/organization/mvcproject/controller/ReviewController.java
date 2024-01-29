package com.organization.mvcproject.controller;

import com.organization.bootcamp.mvcproject.api.service.ReviewService;
import com.organization.bootcamp.mvcproject.api.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;


    @PostMapping
    public String addReview(Review review, ModelMap model) {
        if(review.getAuthor().equals("")) {
            review.setAuthor("anonymous");
        }
        Review newReview = reviewService.saveReview(review);
        return "redirect:/reviews/" + newReview.getId();
    }

    @GetMapping("/{id}")
    public ModelAndView showReviewDetailsPage(@PathVariable(name = "id") Long reviewId, ModelMap model) {
        Review review = reviewService.findById(reviewId);
        return new ModelAndView("reviewDetailPage", "review", review);
    }

}
