package com.kyroxen.graphql.graphql.dao;

import com.kyroxen.graphql.graphql.model.Post;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PostDao {

    private static List<Post> POSTS = new ArrayList<>();
    static {
        Post post1 = Post.builder()
                .id("1")
                .category("Cat1")
                .text("Post1 has this text")
                .title("Post1 Title")
                .build();

        Post post2 = Post.builder()
                .id("2")
                .category("Cat1")
                .text("Post2 has this text")
                .title("Post2 Title")
                .build();

        POSTS.add(post1);
        POSTS.add(post2);
    }

    public List<Post> getRecentPosts(int count, int offset) {
        return POSTS.stream().skip(offset).limit(count).collect(Collectors.toList());
    }
}