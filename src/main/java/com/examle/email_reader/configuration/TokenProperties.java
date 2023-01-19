package com.examle.email_reader.configuration;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Data
@EnableConfigurationProperties
@Configuration
@Validated
@ConfigurationProperties(prefix = "token")
public class TokenProperties {

    @NotEmpty
    private String url;

    @NotEmpty
    private String tenant;

    @NotEmpty
    private String clientId;
    @NotEmpty
    private String clientSecret;

    @NotEmpty
    private String authority;

    @NotEmpty
    private String scope;
}
