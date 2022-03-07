package com.domaingerry.services;

import java.util.Optional;

import javax.transaction.Transactional;

import com.domaingerry.models.entities.Supplier;
import com.domaingerry.models.repos.SupplierRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SuppliersService {

    @Autowired
    private SupplierRepo supplierRepo;

    public Supplier save(Supplier Supllier){
        return supplierRepo.save(Supllier);

    }

    public Supplier findOne(Long id){
        Optional <Supplier> supplier=supplierRepo.findById(id);
        if(!supplier.isPresent()){
            return null;
        }
        return supplier.get();
    }

    public Iterable<Supplier>findAll(){
        return supplierRepo.findAll();
    }
    
    public void removeOne(Long id){
        supplierRepo.deleteById(id);
    }
}
