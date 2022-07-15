import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("N sayısını belirleyiniz :");
        int n = input.nextInt();

        double harmonic = 0;

        for (int i = 1; i <= n; i++) {
            harmonic += (1 / i);
        }

        System.out.println("Sonuc : " + harmonic);
    }
}
