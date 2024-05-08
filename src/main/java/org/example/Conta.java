package org.example;

public class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void atualizarSaldo(double taxaPercentual) {
        if (taxaPercentual >= 0) {
            saldo = saldo * (taxaPercentual / 100);
            System.out.println("Saldo atualizado com sucesso com uma taxa de " + taxaPercentual + "%.");
        } else {
            System.out.println("A taxa percentual deve ser um valor positivo.");
        }

    }
}
