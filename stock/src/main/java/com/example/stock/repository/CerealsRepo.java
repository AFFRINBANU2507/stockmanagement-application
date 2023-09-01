package com.example.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.stock.model.Cereals;

public interface CerealsRepo extends JpaRepository<Cereals, Long>{

}