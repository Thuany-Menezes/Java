package lampada;
import java.util.Scanner;

public class Lampada{
  private int estado;
  public Lampada() {
    this.estado = 0; //inicia a lampada desligada por padrão
  }
  public void ligar() {
    estado = 1;
    System.out.println("A lâmpada está LIGADA");
  }
  public void desligar() {
    estado = 0;
    System.out.println("A lâmpada está DESLIGADA");
  }

  public int getEstado(){
    return estado;
  }
  
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("0- DESLIGADA \n1- LIGADA");
    int estadoLampada = scanner.nextInt();

    Lampada lampada = new Lampada();

    if (estadoLampada == 0){
      lampada.desligar();
    }
    else if (estadoLampada == 1){
      lampada.ligar();
    }
    else{
      System.out.println("PARABÉNS VOCÊ EXPLODIU A LÂMPADA!!!!");
    }
  scanner.close();
  }
}
