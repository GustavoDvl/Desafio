package com.devsuperior.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {


    public Double shipment(Double basic){
        if(basic < 100.00){
            return 20.00;
        }else if(basic < 200){
            return 12.00;
        }else{
            return 0.0;
        }
    }
}
