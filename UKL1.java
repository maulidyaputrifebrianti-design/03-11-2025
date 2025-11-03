import java.util.Scanner;

public class UKL1 {
    public static void main(String[] args) {
        int berat,jarak,panjang,lebar,tinggi,biaya=0,volume=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan berat paket");
        berat = input.nextInt();
        System.out.println("Masukan jarak Pengiriman");
        jarak = input.nextInt();

        if(jarak <= 10){
            biaya = berat *4250;
        }else if(jarak > 10){
            biaya = berat *6000;
            
        }
        System.out.println("Masukkan panjang paket");
        panjang = input.nextInt();
        System.out.println("Masukkan lebar paket");
        lebar = input.nextInt();
        System.out.println("Masukkan tinggi paket");
        tinggi = input.nextInt();
        volume = panjang*lebar*tinggi;

        if(volume>100){
            biaya+= 50000;
        }else{
            biaya +=0;

        }
        System.out.println("Total yang dibayarkan "+biaya);

        input.close();
        
        
    }
}

