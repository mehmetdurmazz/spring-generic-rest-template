package com.springframeworktraining.springgenericresttemplate.rest;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestCallerImpl implements RestCaller {

    private final RestTemplate restTemplate;

    public RestCallerImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /* This method is used to make GET Request
     *
     * @param url, request to make
     * @param responseType, Generic response type
     * @return ResponseEntity, Returns a response entity
     */

    @Override
    public <T> ResponseEntity<T> callGet(String url, ParameterizedTypeReference<T> responseType) {
        return restTemplate.exchange(url, HttpMethod.GET, null, responseType);
    }

    /*
     * This method is used to make PUT Request
     *
     * @param url, request to make
     * @param responseType, Generic response type
     * @param queryParams, (@Nullable) Query parameters for request body.
     *  Can be MultiValueMap or JSON String
     * @param responseType, Generic response type
     * @return ResponseEntity, Returns a response entity
     */

    @Override
    public <T> ResponseEntity<T> callPut(String url, Object requestBody, ParameterizedTypeReference<T> responseType) {
        return restTemplate.exchange(url, HttpMethod.PUT, new HttpEntity<>(requestBody), responseType);
    }

    /*
     * This method is used to make PUT Request
     *
     * @param url, request to make
     * @param bodyAsJsonStr (@Nullable) Request body for POST request.
     *   Can be MultiValueMap or JSON String
     * @param responseType, Generic response type
     * @return ResponseEntity, Returns a response entity
     */

    @Override
    public <T> ResponseEntity<T> callPost(String url, Object requestBody, ParameterizedTypeReference<T> responseType) {
        return restTemplate.exchange(url, HttpMethod.POST,  new HttpEntity<>(requestBody), responseType);
    }
}
