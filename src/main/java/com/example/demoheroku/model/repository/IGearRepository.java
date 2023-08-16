package com.example.demoheroku.model.repository;


import com.example.demoheroku.model.entity.car.Gear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
public interface IGearRepository extends JpaRepository<Gear, Integer> {

    @Query(value = "select * from gear", nativeQuery = true)
    List<Gear> getListGear();
}
