package com.microservicios.suma.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalControlador {
    @RequestMapping("/sumar")
    public Integer sumar(@RequestParam(value="calculoSumar") String valores) {
        String[] valoresArr = valores.split(",");
        int valoresSum = 0;
        for (int i = 0; i < valoresArr.length; i++) {
            valoresSum += Integer.valueOf(valoresArr[i]);
        }
        System.out.println("Suma: "+valoresSum);
        return valoresSum;
    }
}
