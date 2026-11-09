package com.example.md03.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class PatientDTO {

    @NotBlank(message = "Tên không được để trống")
    private String name;

    @Min(value = 0, message = "Tuổi không được âm")
    private Integer age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
}
