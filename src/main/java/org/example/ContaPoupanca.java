package org.example;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldo) {
        super(saldo);
    }
    @Override
    public void atualizarSaldo(double taxaPercentual) {
        if (taxaPercentual >= 0) {
            double taxaAtualizada = taxaPercentual * 3;
            super.atualizarSaldo(taxaAtualizada);
        } else {
            System.out.println("A taxa percentual deve ser um valor positivo.");
        }
    }
}
