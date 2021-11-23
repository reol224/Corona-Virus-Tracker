package com.jul.CoronaTracker.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "virus")
@Getter
@Setter
@Component
public class DataUrlProperties {
    private String url;
}
