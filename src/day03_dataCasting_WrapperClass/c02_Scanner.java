package day03_dataCasting_WrapperClass;

import java.util.Scanner;

public class c02_Scanner {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki
        // formatta yazdirin.girilen bilgiler : J Doe, 44
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen isim soy isim ve yaşınızı giriniz"+
                "\n girilen her bilgiden sonra ENTER a basınız");

        char isimIlkharf= scan.nextLine().charAt(0);

        String soyisim=scan.nextLine();
        double yas=scan.nextDouble();


        System.out.println("girilen bilgiler:"+ isimIlkharf +"  " +soyisim + ",  "+ yas);

    }
}
