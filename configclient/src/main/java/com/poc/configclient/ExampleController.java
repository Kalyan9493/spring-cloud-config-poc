package com.poc.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ExampleController {

    @Value("${example.property}")
    private String exampleProperty;

    @GetMapping("/config")
    public String getConfig() {
        return exampleProperty;
    }
}

