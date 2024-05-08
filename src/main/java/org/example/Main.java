package org.example;

public class Main {
    public static void main(String[] args) {
        // Criando uma nova conta com saldo inicial de R$100
        ContaCorrente minhaConta = new ContaCorrente(100);

        // Verificando o saldo inicial
        System.out.println("Saldo inicial: " + minhaConta.getSaldo());

        // Depositando R$50
        minhaConta.depositar(50);

        // Verificando o saldo após o depósito
        System.out.println("Saldo após depósito: " + minhaConta.getSaldo());

        // Sacando R$30
        minhaConta.sacar(30);

        // Verificando o saldo após o saque
        System.out.println("Saldo após saque: " + minhaConta.getSaldo());

        // Atualizando o saldo com uma taxa de 5%
        minhaConta.atualizarSaldo(5);
    }
}