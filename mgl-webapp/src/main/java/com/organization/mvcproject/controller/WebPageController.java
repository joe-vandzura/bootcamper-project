package com.organization.mvcproject.controller;

import com.organization.mvcproject.model.GameImpl;
import com.organization.mvcproject.model.ReviewImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebPageController {

    @GetMapping(value = "/")
    public String showLandingPage() {
        return "index";
    }

    @GetMapping(value = "/games")
    public ModelAndView showGamesPage() {
        return new ModelAndView("gamesPage", "command", new GameImpl());
    }

    @GetMapping(value = "/reviews")
    public ModelAndView showReviewForm() {
        return new ModelAndView("reviewCreatePage", "command", new ReviewImpl());
    }

}
