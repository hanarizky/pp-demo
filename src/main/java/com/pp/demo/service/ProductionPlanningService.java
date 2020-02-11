package com.pp.demo.service;

import com.pp.demo.model.ProductionPlanningModel;
import com.pp.demo.model.Response;
import org.springframework.stereotype.Service;

@Service
public class ProductionPlanningService {

    public Response calculatePP(ProductionPlanningModel productionPlanningModel){
        Integer days = productionPlanningModel.getDays();
        Integer capacity = productionPlanningModel.getCapacity();
        Integer previous = productionPlanningModel.getPrevious();
        Integer growth = productionPlanningModel.getGrowth();

        Integer mc = days * capacity;
        Integer bp = previous + ((previous*growth)/100);
        Integer util = (bp/mc) * 100;

        Response result = new Response();
        result.setBaseProduction(bp);
        result.setMonthlyCapacity(mc);
        result.setUtilization(util);

        return result;
    }
}
