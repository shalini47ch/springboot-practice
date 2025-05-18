package com.telusco.DemoApp2.controller;

import com.telusco.DemoApp2.model.Product;
import com.telusco.DemoApp2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    //service layer is the one where we write the business logic of the product

    @Autowired
    ProductService service;

    @RequestMapping("/product")
    public List<Product> getProducts(){
        //we need the object of product service here so we will fetch it from the springboot using autowire
        return service.getProduct();
    }

    //now assume that you need only one product on the basis of id
    @RequestMapping("/product/{prodId}")
    //using the annotation PathVariable so that it can be matched with the parameter sent in the request
    public Product getProductById(@PathVariable int  prodId){
        return service.getProductbyIdd(prodId);
    }

    //so all the logic will be written in the service layer the controllers will only fetch the requres from the service
    @PostMapping("/product")
    //here we need the data from client we need the annotation of RequestBody so this helps in post request
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }
   //logic for updation of product
    @PutMapping("/product")
    //using request body as we need to put the data for product
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }
    //write the logic of deleteProduct by a specific id
    @DeleteMapping("/product/{eleId}")
    public void deleteProduct(@PathVariable int eleId){
        service.deleteProduct(eleId);
    }

}



