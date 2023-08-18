package day03_dataCasting_WrapperClass;

import java.util.Scanner;

public class c03_KendiCalismam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    // adını soyadını yaşını sor en son girilen bilgileri çıktıda göster

        System.out.println("lütfen isminizi giriniz");

        String isim= scan.next();
        System.out.println("lütfen soy isminizi giriniz");
        String soyisim= scan.next();
        System.out.println("lütfen yaşınızı giriniz");
        int yas= scan.nextInt();
    }
}
