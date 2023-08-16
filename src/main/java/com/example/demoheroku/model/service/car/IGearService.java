package com.example.demoheroku.model.service.car;


import com.example.demoheroku.model.entity.car.Gear;

import java.util.List;

public interface IGearService {
    List<Gear> findAll();
}
