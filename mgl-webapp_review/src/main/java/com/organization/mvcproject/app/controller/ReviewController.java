package com.organization.mvcproject.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.organization.mvcproject.app.model.Review;


@Controller
@RequestMapping("/reviews")
public class ReviewController {


    @GetMapping(value = "/review")
    public ModelAndView review() {
        return new ModelAndView("reviewCreatePage", "command", new Review());
    }

    @PostMapping(value = "/addReview")
    public ModelAndView addReview(Review review, ModelMap model) {
        if(review.getAuthor().equals("")) {
            review.setAuthor("anonymous");
        }
        return new ModelAndView("reviewDetailPage", "submittedReview", review);
    }
    
    
}
