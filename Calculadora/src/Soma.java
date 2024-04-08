import java.util.Scanner;
public class Soma {
    public static void main (String[] args){
    Scanner sc = new Scanner (System.in);

    System.out.println("Digite os números:");
    int numero1 = sc.nextInt();
    int numero2 = sc.nextInt();
    int resultado = numero1 + numero2;

    System.out.println("A soma do seu numero é " + resultado);
    }
}
