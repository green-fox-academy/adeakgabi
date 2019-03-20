package com.greenfox.reddit.controller;

import com.greenfox.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RedditController {

    private RedditService redditService;

    @Autowired
    public RedditController(RedditService redditService) {
        this.redditService = redditService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String reddit (Model model){
        model.addAttribute("posts", redditService.getAllPosts());
        return "index";
    }
}
