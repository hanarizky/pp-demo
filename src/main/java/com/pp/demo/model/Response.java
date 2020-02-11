package com.pp.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response {
    private Integer baseProduction;
    private Integer monthlyCapacity;
    private Integer utilization;
}
