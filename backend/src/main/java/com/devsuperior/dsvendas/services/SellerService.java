package com.devsuperior.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    
    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
        List<Seller> sellers = repository.findAll();
        return sellers.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList()); 
    }
}
