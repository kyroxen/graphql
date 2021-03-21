package com.kyroxen.graphql.graphql.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Author {
    private String id;
    private String name;
}