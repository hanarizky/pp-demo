package com.pp.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductionPlanningModel {
    private Integer previous;
    private Integer promotion;
    private Integer growth;
    private Integer days;
    private Integer capacity;
}
