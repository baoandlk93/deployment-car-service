package com.example.demoheroku.model.service.car;


import com.example.demoheroku.model.dto.CarDto;
import com.example.demoheroku.model.dto.ICarDto;
import com.example.demoheroku.model.entity.car.Brand;
import com.example.demoheroku.model.entity.car.Car;
import com.example.demoheroku.model.entity.car.Gear;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICarService {

    Page<ICarDto> findAllCar(Pageable pageable, String name);

    Optional<ICarDto> findByIdDto(int id);
    Optional<Car> findById(int id);

    void deleteCar(int id);

    List<Gear> gearList();

    List<Brand>brandList();

    List<ICarDto> findAllCarByCustomer(int id);

    void addNewCar(CarDto carDto);
}
