package com.example.Thes.controller;

import com.example.Thes.model.Produit;
import com.example.Thes.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProduitController {

    @Autowired
    private ProduitService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listProduits", service.listAll());
        return "index";
    }

    @GetMapping("/nouveau")
    public String showNewForm(Model model) {
        model.addAttribute("produit", new Produit());
        return "formulaire-produit";
    }

    @PostMapping("/enregistrer")
    public String saveProduit(@ModelAttribute("produit") Produit produit) {
        service.save(produit);
        return "redirect:/";
    }

    @GetMapping("/modifier/{id}")
    public String showEditForm(@PathVariable(name = "id") Long id, Model model) {
        model.addAttribute("produit", service.get(id));
        return "formulaire-produit";
    }

    @GetMapping("/supprimer/{id}")
    public String deleteProduit(@PathVariable(name = "id") Long id) {
        service.delete(id);
        return "redirect:/";
    }
}