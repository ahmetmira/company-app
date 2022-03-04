package com.company.service;

import com.company.model.Product;
import com.company.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void updateProduct(Long id, Product product) {
        Product uproduct = productRepository.findById(id).get();
        uproduct.setProductName(product.getProductName());
        uproduct.setStock(product.getStock());
        uproduct.setPrice(product.getPrice());
        uproduct.setWeight(product.getWeight());
        productRepository.save(uproduct);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}
