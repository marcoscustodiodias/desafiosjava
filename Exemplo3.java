import java.io.IOException;
import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt(); // 2
        int Y = leitor.nextInt(); // 3

        while (X != 0 && Y != 0) {
            if (X > 0 && Y > 0) {
                System.out.println("primeiro");
            }

            else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            }

            else if (X < 0 && Y < 0) {
                System.out.println("terceiro");
            }

            else if (X > 0 && Y < 0) {
                System.out.println("quarto");
            }

            X = leitor.nextInt();
            Y = leitor.nextInt();
        }

        leitor.close();
    }
}
