package com.xzw.openapiclientsdk;

import com.xzw.openapiclientsdk.client.OpenApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author maroon
 * @date 2023/3/8 16:35
 */
@Configuration
@ConfigurationProperties("openapi.client")
@Data
@ComponentScan
public class OpenApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public OpenApiClient openApiClient() {
        return new OpenApiClient(accessKey, secretKey);
    }
}
