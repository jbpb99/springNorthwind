package com.northwind.northwind.repositories;

import com.northwind.northwind.entities.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ShipperRepository extends JpaRepository<Shipper, Integer> {
}
