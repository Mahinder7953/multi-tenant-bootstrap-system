package com.example.library.config;

import com.example.library.client.TenantClient;
import com.example.library.entity.Tenant;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;

public class TenantsConfig {
    private static final Logger log = (Logger) LoggerFactory.getLogger(TenantsConfig.class);
    private List<Tenant> TENANTS = new ArrayList<>();
    private TenantClient tenantClient;

    public TenantsConfig(TenantClient tenantClient){
        this.tenantClient=tenantClient;
        loadTenants();
    }

    private void loadTenants() {
        log.info("Starting tenant loading...");
    try {
        List<Tenant> loadTenants = new ArrayList<>();
        loadTenants = tenantClient.getAllTenants();
        TENANTS.clear();
        TENANTS.addAll(loadTenants);
        log.info("Loaded {} tenants",TENANTS.size());
    } catch (Exception e) {
        log.error("Failed to load tenants", e);
    }
    }
    public List<Tenant> getAllTenants(){
        return this.TENANTS;
    }
}
