package com.domaingerry.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.domaingerry.models.entities.Product;
import com.domaingerry.models.repos.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ProductService {
    
    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product){
        return productRepo.save(product);
    }

    public Product findOne(Long id){
        // String abc="kosong";
        Optional<Product> product=productRepo.findById(id);
        if(!product.isPresent()){
            return null;
            // System.out.println("Data kosong");
        }
        return product.get();
    }

    public Iterable<Product>findAll(){
        return productRepo.findAll();
    }

    public void removeOne(long id){
        productRepo.deleteById(id);
    }
    public List<Product>findByName(String name){
        return productRepo.findByNameContains(name);
    }

}
