package com.tylerspub.revamped.service;

import com.tylerspub.revamped.domain.Product;
import com.tylerspub.revamped.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) { this.productRepository = productRepository; }

    @Override
    public List<Product> findAll() {return (List<Product>) productRepository.findAll();}
    public List<Product> listAll(String keyword) {
        if(keyword !=null) {
            return productRepository.search(keyword);
        }
        return (List<Product>) productRepository.findAll();
    }
    @Override
    public Product findById(int id) {
        int theIdl = (int)id;
        Optional<Product> result = productRepository.findById(theIdl);

        Product product = null;
        if(result.isPresent()) {
            product = result.get();
        }
        else {
            throw new RuntimeException("Did not find product with id: " + theIdl);
        }
        return product;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }

}
