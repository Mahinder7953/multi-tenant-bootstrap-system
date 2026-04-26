package com.example.tenant_consumer_service.config;

import com.example.library.client.TenantClient;
import com.example.library.config.TenantsConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    public TenantClient tenantClient(@Value("${tenant-service.url}") String url){
        return new TenantClient(new RestTemplate(),url);
    }

    @Bean
    public TenantsConfig tenantsConfig(TenantClient tenantClient){
        return new TenantsConfig(tenantClient);
    }
}
