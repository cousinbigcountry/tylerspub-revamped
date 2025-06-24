package com.tylerspub.revamped.service;

import com.tylerspub.revamped.domain.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    public Product findById(int id);
    public void save(Product product);
    public void deleteById(int id);

    public List<Product> listAll(String keyword);
}
