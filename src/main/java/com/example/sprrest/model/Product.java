package com.example.sprrest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int id;
    private String name;
    private BigDecimal cost;

}
