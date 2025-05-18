package com.telusco.DemoApp2.service;

import com.telusco.DemoApp2.model.Product;
import com.telusco.DemoApp2.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Service
public class ProductService {
    //here a list of products is created ,asList is immutable so using Arraylist
    //instead of hardcoding use the jpa repository
    @Autowired
    ProductRepo repo;
//    List<Product> products= new ArrayList<>(Arrays.asList(new Product(12,"Iphone",80000),new Product(13,"Camera",70000)));

    //here we will create a class that will return the list of products
    public List<Product> getProduct(){
        //here the return type will be list of products
        return repo.findAll();
    }

    public Product getProductbyIdd(int prodId) {
        //since we are using spring jpa no need of hardcoding the logic
        return repo.findById(prodId).orElse(new Product());

    }
    //now here we need to add products from the client side in our list of products
    public void addProduct(Product prod){
        repo.save(prod); //this save methid will help to add the product in the list of products
//        products.add(prod);
    }


    public void updateProduct(Product prod) {
        //instead of using hardcoding logic wewill use jparepo and here also we will use the save method
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        //here we need to delete a specific product by id
        repo.deleteById(prodId);

    }
}
