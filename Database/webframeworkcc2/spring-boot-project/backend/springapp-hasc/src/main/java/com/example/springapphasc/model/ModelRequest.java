package com.example.springapphasc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelRequest {
    private Customer cutsomer;
    private Appliance appliance;
    private ServiceRequest serviceRequest;

}
