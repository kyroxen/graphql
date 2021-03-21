package com.kyroxen.graphql.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.kyroxen.graphql.graphql.model.Post;
import com.kyroxen.graphql.graphql.service.PostService;
import org.springframework.stereotype.Component;

@Component
public class PostQuery implements GraphQLQueryResolver {

    private final PostService postService;

    public PostQuery(PostService postService) {
        this.postService = postService;
    }

    public List<Post> getRecentPosts(int count, int offset) {
        return postService.getRecentPosts(count, offset);
    }
    public Post getById(String id) throws Exception {
        return postService.findById(id);
    }
}