package com.github.jakimli.pandaria.domain.http;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

import static com.google.common.collect.Maps.newHashMap;

@Component
@Scope("cucumber-glue")
@ConfigurationProperties(prefix = "http")
public class HttpGlobalHeaders {

    private Map<String, String> headers = newHashMap();

    //required for spring
    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }
}
