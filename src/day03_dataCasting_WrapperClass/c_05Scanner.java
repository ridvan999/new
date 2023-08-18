package day03_dataCasting_WrapperClass;

import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class c_05Scanner {
    public static void main(String[] args) {
        //soru 7- kullanıcıdan 2 sayı alın sayıların yerini değiştirin
        //kullanıcı sayi1=10, sayi2=20 değeri girsin
        //sayi1in yeni değeri 20 sayi2nin yeni değeri 10 olsun
        Scanner scan= new Scanner(System.in);
        System.out.println("sayi 1 i giriniz (tamsayi)");
        int sayi1=scan.nextInt();
        System.out.println("sayi 2yi giriniz (tamsayi)");
        int sayi2=scan.nextInt();
        int temp=0;
        temp=sayi2;
        sayi2=sayi1;
        sayi1 = temp;
        System.out.println("sayi 1 in yeni değeri:"+sayi1);
        System.out.println("sayi 2 nin yeni değeri:"+sayi2);


    }
}
