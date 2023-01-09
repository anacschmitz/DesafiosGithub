package br.com.JUnitDio;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExceptionsTeste {

 @Test
    public void validaCenariodeExcessao(){
     Conta contaOrigem = new Conta("145875", 0 );
     Conta contaDestino = new Conta("478755", 1000);

     Assertions.assertThrows(IllegalAccessError.class, ()->
             TransferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
 }


}
