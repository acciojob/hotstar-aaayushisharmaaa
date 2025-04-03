package com.driver.controllers;


import com.driver.EntryDto.WebSeriesEntryDto;
import com.driver.model.WebSeries;
import com.driver.services.WebSeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/webseries")
public class WebseriesController {

    @Autowired
    WebSeriesService webSeriesService;

    @PostMapping("/add")
    public int addWebSeries(@RequestBody WebSeriesEntryDto webSeriesEntryDto){

        try{
            return webSeriesService.addWebSeries(webSeriesEntryDto);

        }catch (Exception e){
            return -1;
        }
    }

//    @GetMapping("/getAll")
//    public List<WebSeries> getAllWebSeries(){
//        return webSeriesService.getAllWebSeries();
//    }


}
