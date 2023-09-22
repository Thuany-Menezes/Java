import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1;   /* Número 1*/
        int n2;  /* Número 2*/

        Scanner input = new Scanner(System.in);
        System.out.println("Escreva um número inicial");
        n1 = input.nextInt();

        System.out.println("Escreva um número final");
        n2 = input.nextInt();




        for (int i = n1+1; i < n2; i++) {
            System.out.println(" " + i);
        }
    }
}
