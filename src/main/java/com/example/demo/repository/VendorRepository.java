package com.example.demo.repository;

import com.example.demo.model.Vendor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VendorRepository extends CrudRepository<Vendor, Long> {
    public Optional<Vendor> findById(Long id);

    public Vendor getById(Long id);
    public Vendor getByName(String name);
    public Vendor getByEmail(String email);

    public boolean existsByEmail(String email);
    public boolean existsByName(String name);
}
