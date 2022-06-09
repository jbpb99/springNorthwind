package com.northwind.northwind.repositories;

import com.northwind.northwind.entities.Shipper;
import org.springframework.data.repository.CrudRepository;

public interface ShipperRepository extends CrudRepository<Shipper, String> {
}
