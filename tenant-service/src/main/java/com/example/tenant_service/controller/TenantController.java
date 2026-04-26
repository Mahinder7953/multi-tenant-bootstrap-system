package com.example.tenant_service.controller;

import com.example.library.entity.Tenant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TenantController {

    @GetMapping("/tenants")
    public List<Tenant> getAllTenants(){
    return List.of(
            new Tenant("msi","micro-star-international"),
            new Tenant("asus","asus"),
            new Tenant("lg","lg-electronics")
    );
    }
}
