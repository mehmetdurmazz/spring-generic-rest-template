package com.springframeworktraining.springgenericresttemplate.service;

import com.springframeworktraining.springgenericresttemplate.config.Endpoint;
import com.springframeworktraining.springgenericresttemplate.response.Post;
import com.springframeworktraining.springgenericresttemplate.rest.RestCaller;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceCallImpl implements ServiceCall {

    private final RestCaller restCaller;
    private final Endpoint endpoint;

    public ServiceCallImpl(RestCaller restCaller, Endpoint endpoint){
        this.restCaller = restCaller;
        this.endpoint = endpoint;
    }


    @Override
    public String sampleGetServiceCallWithStringResponse() {

        ResponseEntity<String> response = restCaller
                .callGet(endpoint.getBlogPostsEndpoint(), new ParameterizedTypeReference<String>() {});

        return response != null && response.hasBody() ? response.getBody() : "";
    }

    @Override
    public Post sampleGetServiceCallWithObjResponse() {

        ResponseEntity<Post> response = restCaller
                .callGet(endpoint.getBlogPostsEndpoint().concat("/42"), new ParameterizedTypeReference<Post>() {});

        return response!=null && response.hasBody() ? response.getBody() : new Post();
    }
}
