package com.northwind.northwind.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Data
public class EmployeeDto implements Serializable {
    @JsonProperty("employee_id")
    private final int employee_id;
    @JsonProperty("lastName")
    private final String lastName;
    @JsonProperty("firstName")
    private final String firstName;
    @JsonProperty("birthDate")
    private final LocalDateTime birthDate;
    @JsonProperty("photo")
    private final String photo;
    @JsonProperty("notes")
    private final String notes;

    public EmployeeDto(int employee_id, String lastName, String firstName, LocalDateTime birthDate, String photo, String notes) {
        this.employee_id = employee_id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.photo = photo;
        this.notes = notes;
    }
}
