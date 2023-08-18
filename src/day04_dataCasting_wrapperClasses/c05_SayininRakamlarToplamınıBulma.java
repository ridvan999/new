package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class c05_SayininRakamlarToplamınıBulma {
    //kullanıcıdan 3 basamaklı sayı isteyin ve rakamlar toplamını bulun
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen 3 basamaklı bir tam sayı giriniz");
        int girilenSayı= scan.nextInt();// girdiğimiz sayıyı ekranda gösterecek

                                     // 135 sayısı girdik diyelim
        int rakam= girilenSayı %10 ;// sayının birler basamağı olan 5
        int rakamlarToplami = rakam;// rakamlar toplamı şu an 5

        girilenSayı= girilenSayı/10;//135i 13 yaptığımız kod
        rakam= girilenSayı %10;     //birler basamağı olan 3 ü bulduk
        rakamlarToplami = rakamlarToplami+rakam;//eski rakamlar toplamına yeni rakamı ekledik 5+3

        girilenSayı = girilenSayı/10;//13 ü 1 yaptık
        rakam=girilenSayı%10;// 1in birler basamağı olan 1 bulduk
        rakamlarToplami= rakamlarToplami+rakam;
        System.out.println("sayının rakamları toplamı:"+rakamlarToplami);







    }


}

