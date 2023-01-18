package com.example.sprrest.config;

import com.example.sprrest.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class ProductConfig {

    @Bean
    public Product product1() {
        return new Product(1, "product1", BigDecimal.valueOf(10));
    }

    @Bean
    public Product product2() {
        return new Product(2, "product2", BigDecimal.valueOf(20));
    }

    @Bean
    public Product product3() {
        return new Product(3, "product3", BigDecimal.valueOf(30));
    }

}
