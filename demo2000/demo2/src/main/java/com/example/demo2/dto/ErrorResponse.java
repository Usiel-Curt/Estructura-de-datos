package com.example.demo2.dto;



import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data

public class ErrorResponse {
    String error;
    String detail;
    
}
