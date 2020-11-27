package com.microservicios.suma.controllers;
import com.microservicios.suma.models.OperadoresDigitos;
import com.microservicios.suma.services.CalculaSumaServicio;
import org.springframework.web.bind.annotation.*;

/**
 * @author Felipe Garrido
 */
@RestController
public class PrincipalControlador {

    @PostMapping(value = "/suma", consumes = "application/json", produces = "application/json")
    public OperadoresDigitos sumar(@RequestBody OperadoresDigitos operadoresDigitos) throws Exception {
        CalculaSumaServicio calculaSumaServicio = new CalculaSumaServicio();
        OperadoresDigitos operadoresDigitosRetorno = calculaSumaServicio.calcularSuma(operadoresDigitos);
        return operadoresDigitosRetorno;
    }
}
