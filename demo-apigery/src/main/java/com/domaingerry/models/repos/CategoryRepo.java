package com.domaingerry.models.repos;

import com.domaingerry.models.entities.Category;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category,Long>{
    
}
