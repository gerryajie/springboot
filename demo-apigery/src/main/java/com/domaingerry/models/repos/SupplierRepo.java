package com.domaingerry.models.repos;

import com.domaingerry.models.entities.Supplier;

import org.springframework.data.repository.CrudRepository;

public interface SupplierRepo  extends CrudRepository<Supplier,Long>{
    
}
