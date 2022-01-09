package com.example.workingdemo.Repository;

import com.example.workingdemo.Model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property,Integer> {
}
