package com.example.library.client;

import com.example.library.entity.Tenant;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class TenantClient {

    private final RestTemplate restTemplate;
    private final String baseUrl;

    public TenantClient(RestTemplate restTemplate, String baseUrl) {
        this.restTemplate = restTemplate;
        this.baseUrl = baseUrl;
    }

    public List<Tenant> getAllTenants() {
        ResponseEntity<List<Tenant>> response =
                restTemplate.exchange(
                        baseUrl,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Tenant>>() {}
                );

        return response.getBody();
    }
}
