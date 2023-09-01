package com.example.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stock.model.Beverages;

public interface BeveragesRepo extends JpaRepository<Beverages, Long>{

}