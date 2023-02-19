package com.example.sprrest.config;

import com.example.sprrest.model.Order;
import com.example.sprrest.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Configuration
public class OrderConfig {

    private final List<Product> productList;

    @Bean
    public Order order1() {
        return new Order(1, LocalDate.now(), BigDecimal.valueOf(10),
                List.of(productList.get(0), productList.get(1)));
    }

    @Bean
    public Order order2() {
        return new Order(2, LocalDate.now(), BigDecimal.valueOf(20),
                List.of(productList.get(1), productList.get(2)));
    }

    @Bean
    public Order order3() {
        return new Order(3, LocalDate.now(), BigDecimal.valueOf(30),
                List.of(productList.get(0), productList.get(2)));
    }

}
