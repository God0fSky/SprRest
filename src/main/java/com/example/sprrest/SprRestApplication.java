package com.example.sprrest;

import com.example.sprrest.model.Order;
import com.example.sprrest.repository.OrderRepository;
import com.example.sprrest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SprRestApplication {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(SprRestApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void inited() {
        orderRepository.getAllOrders();
        orderRepository.getOrderById(2);
        orderRepository.addOrder(new Order(4, LocalDate.now(), BigDecimal.valueOf(10),
                List.of(productRepository.getProductList().get(1),
                        productRepository.getProductList().get(2))));
        orderRepository.getAllOrders();
    }

}
