package com.domaingerry.services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.domaingerry.models.entities.Category;
import com.domaingerry.models.repos.CategoryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;
    
    public Category save(Category category){
        return categoryRepo.save(category);
    }

    public Category findone(Long id){
        Optional <Category> category=categoryRepo.findById(id);
        if(!category.isPresent()){
            return null;
        }
        return category.get();
    }

    public Iterable<Category>findAll(){
        return categoryRepo.findAll();
    }

    public void removeOne(Long id){
        categoryRepo.deleteById(id);
    }

}
