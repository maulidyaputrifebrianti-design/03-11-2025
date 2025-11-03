
import java.util.Scanner;

public class S2UKL2 {
    public static double hitungVolumeTabung(double radius, double tinggi) {
        double volume = Math.PI * radius * radius * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double radius = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = scanner.nextDouble();
        double volume = hitungVolumeTabung(radius, tinggi);
        System.out.println("Volume tabung adalah: " + volume);
    }

    }

