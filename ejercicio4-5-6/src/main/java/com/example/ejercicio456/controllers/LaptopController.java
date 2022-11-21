package com.example.ejercicio456.controllers;

import com.example.ejercicio456.entities.Laptop;
import com.example.ejercicio456.repositories.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    @Autowired
    private LaptopRepository laptopRepository;

    //    GET ALL LAPTOPS
    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    //    CREATE
    @PostMapping("/api/laptop")
    public Laptop create(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    //    GET LAPTOP BY ID
    @GetMapping("/api/laptop/{id}")
    public ResponseEntity<Laptop> findById(@PathVariable Long id) {
        Optional<Laptop> laptopOpt = laptopRepository.findById(id);
        if (laptopOpt.isPresent()) {
            return ResponseEntity.ok(laptopOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
