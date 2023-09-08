import java.util.Locale;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner numero1Scanner = new Scanner(System.in);
System.out.print("Digite o primeiro número: ");
double numero1 = numero1Scanner.nextDouble();
Scanner numero2Scanner = new Scanner(System.in);
System.out.print("Digite o segundo número: ");
double numero2 = numero2Scanner.nextDouble();
double total=numero1+numero2;
System.out.print("O resultado eh: "+Math.round(total));

}
}