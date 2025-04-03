package com.driver.services;


import com.driver.EntryDto.ProductionHouseEntryDto;
import com.driver.model.ProductionHouse;
import com.driver.repository.ProductionHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductionHouseService {

    @Autowired
    ProductionHouseRepository productionHouseRepository;



    public Integer addProductionHouseToDb(ProductionHouseEntryDto productionHouseEntryDto){
        ProductionHouse productionHouse = new ProductionHouse();
        productionHouse.setName(productionHouseEntryDto.getName());
        productionHouse.setRatings(0.0); // Default rating
        productionHouse = productionHouseRepository.save(productionHouse);
        return productionHouse.getId();
        //return  null;
    }


//    public ProductionHouse getProductionHouseById(Integer id) {
//        return productionHouseRepository.findById(id).orElse(null);
//    }
//
//    public List<ProductionHouse> getAllProductionHouses() {
//        return productionHouseRepository.findAll();
//    }
}
