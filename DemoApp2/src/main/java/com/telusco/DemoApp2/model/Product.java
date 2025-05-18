package com.telusco.DemoApp2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//here since we need to make a table of product
@Entity
public class Product {
    //here we will declare the values to have the data of the products
    //we need to also declare the thing which can be used as a primary key
    @Id
    private int prodId;
    private String prodName;
    private int price;

    //we can directly use lombok so that the getters and setters can be handled automatically

}
