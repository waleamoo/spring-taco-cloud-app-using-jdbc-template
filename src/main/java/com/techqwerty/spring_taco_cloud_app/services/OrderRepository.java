package com.techqwerty.spring_taco_cloud_app.services;

import com.techqwerty.spring_taco_cloud_app.entities.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
