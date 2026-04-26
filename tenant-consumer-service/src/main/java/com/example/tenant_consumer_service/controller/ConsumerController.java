package com.example.tenant_consumer_service.controller;

import com.example.library.config.TenantsConfig;
import com.example.library.entity.Tenant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {
    private TenantsConfig tenantsConfig;
    ConsumerController(TenantsConfig tenantsConfig){
        this.tenantsConfig=tenantsConfig;
    }
    @GetMapping("/tenants")
    public List<Tenant> getAllTenants(){
        return tenantsConfig.getAllTenants();
    }
}
