package com.sheldon.servicefeign.feignfallbackhandlers;

import com.sheldon.servicefeign.feigninterface.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
