package br.com.infnet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Logs {
    public static void main(String[] args) {
        log.debug("Iniciou o Programa");

        try{
            var y = 4/1;
            log.info("Resultado da divisao é: " + y);

            var x = 4/0;
            log.info("Resultado da divisao é: " + x);
        }catch (ArithmeticException e){
            log.error("Ocorreu um erro na divisão", e);
        }

        log.debug("Finalizou o programa");
    }
}
