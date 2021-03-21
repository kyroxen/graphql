package com.kyroxen.graphql.graphql.service;

import com.kyroxen.graphql.graphql.dao.PostDao;
import com.kyroxen.graphql.graphql.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostDao postDao;

    public PostService(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> getRecentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }
}
