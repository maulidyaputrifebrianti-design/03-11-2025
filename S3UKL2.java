import java.util.Scanner;

public class S3UKL2 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        // Input ukuran matriks
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt(); 
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        // Input elemen matriks pertama
        System.out.println("\nMasukkan elemen untuk matriks pertama:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks1[i][j] = input.nextInt();
            }
        }

        // Input elemen matriks kedua
        System.out.println("\nMasukkan elemen untuk matriks kedua:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks2[i][j] = input.nextInt();
            }
        }

        // Proses penjumlahan matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        // Output hasil penjumlahan matriks
        System.out.println("\nHasil penjumlahan matriks:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}   
    

