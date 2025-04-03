package com.driver.controllers;


import com.driver.EntryDto.ProductionHouseEntryDto;
import com.driver.model.ProductionHouse;
import com.driver.services.ProductionHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/production")
public class ProductionHouseController {
    @Autowired
    ProductionHouseService productionHouseService;

//    @GetMapping("/get/{id}")
//    public ProductionHouse getProductionHouseById(@PathVariable("id") Integer id){
//        return productionHouseService.getProductionHouseById(id);
//    }
//
//    @GetMapping("/getAll")
//    public List<ProductionHouse> getAllProductionHouses(){
//        return productionHouseService.getAllProductionHouses();
//    }
    @PostMapping("/add")
    public Integer addProductionHouseInfoIntoDb(@RequestBody ProductionHouseEntryDto productionHouseEntryDto){

        //Default ratings of the ProductionHouse should be 0
        return productionHouseService.addProductionHouseToDb(productionHouseEntryDto);

    }

}
