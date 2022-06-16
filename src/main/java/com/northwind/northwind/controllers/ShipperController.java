package com.northwind.northwind.controllers;

import com.northwind.northwind.dto.ShipperDto;
import com.northwind.northwind.entities.Shipper;
import com.northwind.northwind.mapstruct.mappers.DTOMapperClass;
import com.northwind.northwind.services.ShipperDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shippers/")
public class ShipperController {
    private ShipperDAO shipperDAO;

    public ShipperController(ShipperDAO shipperDAO) {
        this.shipperDAO = shipperDAO;
    }

    //Get
    @GetMapping
    @RequestMapping("/get/")
    public List<ShipperDto> getShipper() {
        List<Shipper> shippers = shipperDAO.findAll();
        List<ShipperDto> shipperDtos = new ArrayList<>();

        shippers.forEach(shipper -> {
            shipperDtos.add(DTOMapperClass.shipperDto(shipper));
        });

        return shipperDtos;
    }

    //Get By Id
    @GetMapping
    @RequestMapping("/get/{id}")
    public ShipperDto getShipperById(@PathVariable int id) {
        Optional<Shipper> shippers = shipperDAO.findById(id);
        ShipperDto shipperDto;

        if(shippers.isPresent()) {
            shipperDto = DTOMapperClass.shipperDto(shippers.get());

            return shipperDto;
        }
        return null;
    }

    //Post
}
