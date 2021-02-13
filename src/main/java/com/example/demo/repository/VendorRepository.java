package com.example.demo.repository;

import com.example.demo.model.Vendor;
import org.springframework.data.repository.CrudRepository;

public interface VendorRepository extends CrudRepository<Vendor, Long> {
    public Vendor getById(Long id);
    public Vendor getByName(String name);
    public Vendor getByEmail(String email);
}
