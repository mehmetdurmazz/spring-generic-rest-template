package com.springframeworktraining.springgenericresttemplate.rest;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;

public interface RestCaller {

    <T> ResponseEntity<T> callGet(String url,  ParameterizedTypeReference<T> responseType);

    <T> ResponseEntity<T> callPut(String url, Object requestBody, ParameterizedTypeReference<T> responseType);

    <T> ResponseEntity<T> callPost(String url, Object requestBody, ParameterizedTypeReference<T> responseType);

}
