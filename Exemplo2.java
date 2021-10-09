import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt();
        for (int i = 1; i < N; i++) {
          System.out.printf("Ho ");
        }
        System.out.printf("Ho!");
        entrada.close();
    }
}
