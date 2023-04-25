package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.model.Grocery;

@Repository
public interface GroceryRepository extends JpaRepository<Grocery,Integer>{

}
