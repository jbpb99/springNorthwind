package com.northwind.northwind.mapstruct.mappers;

import com.northwind.northwind.dto.CategoryDto;
import com.northwind.northwind.entities.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDto categoryDto(Category category);


}
