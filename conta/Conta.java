package conta;

import java.util.Scanner;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public boolean realizarSaque(double quantiaSaque) {
        if (saldo >= quantiaSaque) {
            saldo -= quantiaSaque;
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }

    public double getSaldo() {
        return saldo;
    }
}
