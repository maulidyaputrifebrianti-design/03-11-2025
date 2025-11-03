
import java.util.Scanner;

public class S3UKL1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("masukkan jumlah siswa:  ");
        int jumlahSiswa = scanner.nextInt();

        double totalNilai = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
        System.out.println("masukkan nilai siswa ke-" + i + ": ");
        double nilai = scanner.nextDouble();
        totalNilai += nilai;

    }
    double rataRata = totalNilai / jumlahSiswa;
    System.out.println("total nilai semua siswa: " + totalNilai);
    System.out.println("Rata-rata nilai siswa: " + rataRata);
    scanner.close();
}
}