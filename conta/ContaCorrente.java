package conta;

import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoInicial = 50.0; // Saldo inicial predefinido

        Conta conta = new Conta(saldoInicial);

        int escolha;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sair");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite a quantia para saque: ");
                    double quantiaSaque = scanner.nextDouble();
                    boolean saqueEfetuado = conta.realizarSaque(quantiaSaque);
                    if (saqueEfetuado) {
                        System.out.println("Saque Efetuado com Sucesso");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 4:
                    System.out.println("Saindo da conta.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (escolha != 4);

        scanner.close();
    }
}