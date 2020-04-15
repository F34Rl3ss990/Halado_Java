package com.example.calculator.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class paramDTO {
    @NotNull
    private Double x;
    private String operator;
    @NotNull
    private Double y;

}
