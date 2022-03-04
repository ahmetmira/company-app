package com.company.service;

import com.company.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product createProduct(Product product);

    void updateProduct(Long id, Product product);

    void deleteProduct (Long id);

}
