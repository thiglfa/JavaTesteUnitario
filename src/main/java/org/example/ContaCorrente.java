package org.example;

public class ContaCorrente extends Conta{
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void atualizarSaldo(double taxaPercentual) {
        if (taxaPercentual >= 0) {
            double taxaAtualizada = taxaPercentual * 2;
            super.atualizarSaldo(taxaAtualizada);
        } else {
            System.out.println("A taxa percentual deve ser um valor positivo.");
        }
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor - 0.10);     //0.10 == taxa bancária de 10 centavos
    }
}
