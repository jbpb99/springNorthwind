package com.northwind.northwind.services.impl;

import com.northwind.northwind.entities.Product;
import com.northwind.northwind.mapstruct.mappers.DTOMapperClass;
import com.northwind.northwind.repositories.ProductRepository;
import com.northwind.northwind.services.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductDAOImpl implements ProductDAO {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(int id) {
        return (Optional<Product>) productRepository.findById(id);
    }

    @Override
    public List<Product> saveAndFlush(Product product) {
        productRepository.saveAndFlush(product);

        return null;
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> updateProduct(Product product, int id) {
        Optional<Product> products = productRepository.findById(id);
        Product productObj;

        if(products.isPresent()) {
            productObj = products.get();

            productObj.setProductName(product.getProductName());
            productObj.setUnit(product.getUnit());
            productObj.setPrice(product.getPrice());

            productRepository.saveAndFlush(productObj);

            return Optional.of(productObj);
        }

        return Optional.empty();
    }
}
