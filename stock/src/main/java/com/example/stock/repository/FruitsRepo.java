package com.example.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stock.model.Fruits;

public interface FruitsRepo extends JpaRepository<Fruits, Long>{

}