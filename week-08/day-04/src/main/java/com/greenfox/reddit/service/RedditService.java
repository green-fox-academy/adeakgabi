package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RedditService {

    private PostRepository postRepository;

    @Autowired
    public RedditService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts(){
        List<Post> posts = new ArrayList<>();
        postRepository.findAll().forEach(post -> posts.add(post));
        return posts;
    }

    public void addPost(Post post){
        postRepository.save(post);
    }


}
