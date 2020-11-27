package com.microservicios.suma.services;
import com.microservicios.suma.models.OperadoresDigitos;
import java.util.ArrayList;

/**
 * @author Felipe Garrido
 */
public class CalculaSumaServicio {

    public OperadoresDigitos calcularSuma(OperadoresDigitos operadoresDigitos) throws Exception {
        OperadoresDigitos operadoresDigitosRetorno = new OperadoresDigitos();
        try {
            ArrayList<Character> operadores = operadoresDigitos.getOperadores();
            ArrayList<Integer> digitos = operadoresDigitos.getDigitos();
            for (int i = 0; i < operadores.size(); i++) {
                if (operadores.get(i) == '+') {
                    operadores.remove(i);
                    digitos.set(i, (digitos.get(i) + digitos.get(i + 1)));
                    digitos.remove(i + 1);
                    i -= 1;
                }
            }
            operadoresDigitosRetorno.setDigitos(digitos);
            operadoresDigitosRetorno.setOperadores(operadores);
        } catch (Exception e) {
            throw new Exception("Error servicio sumar: " + e.getMessage());
        }
        return operadoresDigitosRetorno;
    }
}
