package calculadora;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        float n1;
        float n2;
        float operacao = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro numero:");
        n1 = input.nextInt();
        System.out.println("Insira o segundo numero:");
        n2 = input.nextInt();

        System.out.println("Escolha uma operação:");
        System.out.println("1.Soma:");
        System.out.println("2.Subtração:");
        System.out.println("3.Divisão:");
        System.out.println("4.Multiplicação:");

        operacao = input.nextInt();

            if (operacao == 1) {
                System.out.println("Resultado:" + (n1 + n2));
            }

            if (operacao == 2) {
                System.out.println("Resultado:" + (n1 - n2));
            }

            if (operacao == 3) {
                System.out.println("Resultado:" + (n1 / n2));
            }

            if (operacao == 4) {
                System.out.println("Resultado:" + (n1 / n2));
            }
    }
}
