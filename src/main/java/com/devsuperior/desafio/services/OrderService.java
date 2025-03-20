package com.devsuperior.desafio.services;

import com.devsuperior.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

        public Double total(Order order){
        double discount = order.getBasic() * (order.getDiscount() / 100);
        double valueAfterDiscount = order.getBasic() - discount;
        double shipping = shippingService.shipment(order.getBasic());
        return valueAfterDiscount + shipping;
        }
    }
