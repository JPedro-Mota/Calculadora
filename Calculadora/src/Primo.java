import java.util.Scanner;
public class Primo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int i = 0;

        for( i=2; i < numero; i++){
            if ( numero % 2 == 0){
                System.out.println("O número não é primo.");
                break;
            }
            else {
                System.out.println("O número é primo. w");
                break;
            }
        }
    }

}