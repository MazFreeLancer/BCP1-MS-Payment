package com.nttdata.MSPayment.config;

import lombok.Data;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Data
@RefreshScope
@Configuration
@EnableWebFlux
public class PaymentConfig implements WebFluxConfigurer {
}
