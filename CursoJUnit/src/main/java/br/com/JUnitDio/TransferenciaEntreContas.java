package br.com.JUnitDio;

public class TransferenciaEntreContas {

    public static void transfere(Conta contaorgigem, Conta contaDestino, int valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }
    }

}
