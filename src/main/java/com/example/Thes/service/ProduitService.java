package com.example.Thes.service;

import com.example.Thes.model.Produit;
import com.example.Thes.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository repo;

    public List<Produit> listAll() { return repo.findAll(); }
    public void save(Produit p) { repo.save(p); }
    public Produit get(Long id) { return repo.findById(id).get(); }
    public void delete(Long id) { repo.deleteById(id); }
}