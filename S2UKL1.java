
import java.util.Scanner;

public class S2UKL1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan bilangan positif: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("ERROR: Bilangan harus positif");
        } else {
            int faktorial = 1;
            for(int i = 1; i <= n; i++){
                faktorial *= i;
            }

                    System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
                }
                scanner.close();
            }
        }
