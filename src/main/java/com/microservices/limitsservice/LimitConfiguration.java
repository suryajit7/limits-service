package com.microservices.limitsservice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LimitConfiguration {

    private int max;
    private int min;
}
