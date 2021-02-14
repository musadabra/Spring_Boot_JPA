package com.example.demo.repository;

import com.example.demo.model.Offer;
import com.example.demo.model.Vendor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OfferRepository extends CrudRepository<Offer, Long> {
    public Optional<Offer> findById(Long id);
    public List<Offer> getByVendor(Vendor vendor);
    public List<Offer> getByTitle(String title);
}
