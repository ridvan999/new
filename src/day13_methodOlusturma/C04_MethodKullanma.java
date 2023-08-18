package day13_methodOlusturma;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {
        // Kullanicidan 10'dan kucuk iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin
        Scanner scan = new Scanner(System.in);
        System.out.println("10'dan kucuk 2 adet pozitif tamsayi girin");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int sonuc=C03_Faktoryel.faktoriyelHesapla(sayi1)
        +C03_Faktoryel.faktoriyelHesapla(sayi2);             //baska classtan method cagırdık
        System.out.println(sonuc);

    }
}