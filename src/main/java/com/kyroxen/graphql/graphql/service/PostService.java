package com.kyroxen.graphql.graphql.service;

import com.kyroxen.graphql.graphql.dao.PostDao;
import com.kyroxen.graphql.graphql.model.Post;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class PostService {
    private final PostDao postDao;

    public PostService(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> getRecentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }

    public Post findById(String id){
        Optional<Post> byId = postDao.findById(id);
        log.info("No post found");
        return byId.orElse(null);
    }
}
