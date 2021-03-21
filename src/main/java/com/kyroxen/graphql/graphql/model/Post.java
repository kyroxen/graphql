package com.kyroxen.graphql.graphql.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Post {
    private String id;
    private String title;
    private String text;
    private String category;
}
