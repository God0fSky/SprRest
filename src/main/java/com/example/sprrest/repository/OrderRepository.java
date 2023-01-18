package com.example.sprrest.repository;

import com.example.sprrest.model.Order;
import com.example.sprrest.model.Product;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRepository {

    @Autowired
    private List<Order> orderList;

    public List<Order> getAllOrders() {
        System.out.println("Available orders");
        return orderList.stream()
                .peek(p -> System.out.println(p))
                .collect(Collectors.toList());
    }

    public Order getOrderById(int id) {
        System.out.println("Selected order");
        Optional<Order> order = orderList.stream()
                .filter(p -> (p.getId() == id))
                .peek(p -> System.out.println(p))
                .findFirst();
        return order.get();
    }

    @NonNull
    public void addOrder(Order order) {
        orderList.add(order);
    }

}
