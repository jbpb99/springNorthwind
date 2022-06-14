package com.northwind.northwind.mapstruct.mappers;

import com.northwind.northwind.dto.CategoryDto;
import com.northwind.northwind.dto.CustomerDto;
import com.northwind.northwind.entities.Category;
import com.northwind.northwind.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DTOMapper {
    CategoryDto categoryDto(Category category);

    CustomerDto customerDTO(Customer customer);

}
