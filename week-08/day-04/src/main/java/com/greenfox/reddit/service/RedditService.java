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

    public Post getPost(Long id){
        Post post = postRepository.findById(id).orElseThrow(NullPointerException::new);
        return post;
    }

    public List<Post> getAllPosts(){
        List<Post> posts = new ArrayList<>();
        postRepository.findAll().forEach(post -> posts.add(post));
        return posts;
    }

    public void addPost(Post post){
        postRepository.save(post);
    }

    public void upVote(Long id){
        Post postWithUpdatedVote = postRepository.findById(id).get();
        postWithUpdatedVote.setVote(postWithUpdatedVote.getVote() +1);
        postRepository.save(postWithUpdatedVote);
    }

    public void downVote(Long id){
        Post postWithUpdatedVote = postRepository.findById(id).get();
        postWithUpdatedVote.setVote(postWithUpdatedVote.getVote() -1);
        postRepository.save(postWithUpdatedVote);
    }


}
