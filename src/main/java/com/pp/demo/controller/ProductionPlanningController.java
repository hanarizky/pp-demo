package com.pp.demo.controller;

import com.pp.demo.model.ProductionPlanningModel;
import com.pp.demo.model.Response;
import com.pp.demo.service.ProductionPlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/productPlanning")
public class ProductionPlanningController {

    @Autowired
    ProductionPlanningService productionPlanningService;

    @PostMapping
    public ResponseEntity calculatePP(@Validated ProductionPlanningModel productionPlanningModel) {

        Response response = productionPlanningService.calculatePP(productionPlanningModel);
        return new ResponseEntity<>(response, HttpStatus.OK);       //response if data created

    }

}