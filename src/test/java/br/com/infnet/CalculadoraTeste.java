package br.com.infnet;

import br.com.infnet.Util.CalculadoraUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTeste {
    @Test
    @DisplayName("Deve retornar 1")
    public void Calculadora(){
        int numero1 = 4;
        int numero2 = 3;
        assertEquals(1, numero1 - numero2);
    }
    @Test
    @DisplayName("Deve retornar um Erro no Calculo")
    public void CalculadoraErro() {
        CalculadoraUtil calculadoraUtil = new CalculadoraUtil();
        assertThrows(ArithmeticException.class, () -> calculadoraUtil.dividir(4, 0));
    }
}
