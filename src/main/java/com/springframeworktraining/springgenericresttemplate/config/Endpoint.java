package com.springframeworktraining.springgenericresttemplate.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class Endpoint {

    @Value("${blog.posts.endpoint}")
    String blogPostsEndpoint;

}
