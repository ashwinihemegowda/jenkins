package com.example.workingdemo.Sevice;

import com.example.workingdemo.Model.Property;
import com.example.workingdemo.Repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
   PropertyRepository propertyRepository;

    public List<Property> getAllProperty(){
        return propertyRepository.findAll();
    }


}
