package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class RedditController {

    private RedditService redditService;

    @Autowired
    public RedditController(RedditService redditService) {
        this.redditService = redditService;
    }

    @GetMapping(value = "/")
    public String reddit (Model model){
        model.addAttribute("posts", redditService.getAllPosts());
        return "index";
    }

    @GetMapping("/submit")
    public String getPost(Model model){
        model.addAttribute("post", new Post());
        return "newpost";
    }

    @PostMapping("/submit")
    public String postTodos(@ModelAttribute Post post){
        redditService.addPost(post);
        return "redirect:/";
    }

    @GetMapping(value = "/{id}")
    public String getVote(@PathVariable("id") Long id, Model model) {
        model.addAttribute("post", redditService.getPost(id));
        return "index";
    }

    @PostMapping(value = "/{id}/up")
    public String upVote(@ModelAttribute Post post) {
        redditService.upVote(post);
        return "redirect:/";
    }

    @PostMapping(value = "/{id}/down")
    public String downVote(@ModelAttribute Post post) {
        redditService.downVote(post);
        return "redirect:/";
    }
}