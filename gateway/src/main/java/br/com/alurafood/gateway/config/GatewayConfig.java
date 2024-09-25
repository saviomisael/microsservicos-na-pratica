package br.com.alurafood.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder
                .routes()
                .route(
                        "pagamentos_actuator",
                        (r) ->
                                r.path("/pagamentos/**")
                                        .uri("lb://pagamentos-ms/pagamentos/**")
                )
                .build();
    }
}
