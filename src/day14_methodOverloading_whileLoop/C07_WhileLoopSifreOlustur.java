package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C07_WhileLoopSifreOlustur {
    public static void main(String[] args) {
        // kullanicidan bir sifre isteyin
        // asagidaki sartlari saglayana kadar,
        // her seferinde hatalari soyleyip yeni sifre isteyin
        // sartlarin saglayan sifre oldugunda
        // "5.denemenizde basarili sifre olusturuldu" seklinde aciklama yazin
        // - ilk harf kucuk harf olmali
        // - son harf buyuk harf olmali
        // - bosluk icermemeli
        // - 8 karakter veya daha uzun olmali
        Scanner scan = new Scanner(System.in);
        String sifre = "";// başlangıçta hiçlik giricez. int sayi=0 gibi düşünelim
        int flag = 0;
        int denemeSayisi = 0;

        while (flag != 4) {
            flag = 0;// her yeni denemede flag 0 dan baslasın diye flagi 0 olarak baslatiriz
            System.out.println("lutfen bir sifre giriniz");
            sifre = scan.nextLine();
            // - ilk harf kucuk harf olmali
            if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
                flag++;
            } else {
                System.out.println("ilk harf kucuk harf olmali");
            }
            // - son harf buyuk harf olmali
            if (sifre.charAt(sifre.length()- 1) >= 'A' && sifre.charAt(sifre.length()- 1) <= 'Z') {
                flag++;
            } else {
                System.out.println("son harf buyuk harf olmali");
            }
            // - bosluk icermemeli
            if (!sifre.contains(" ")) {
                flag++;
            } else {
                System.out.println("sifre bosluk iceremez");
            }
            // - 8 karakter veya daha uzun olmali
            if (sifre.length() > 8) {
                flag++;
            } else {
                System.out.println("en az 8 karekter olmali");
            }
            denemeSayisi++;
        }
        System.out.println("tebrikler "+denemeSayisi+" denemede sifreniz  basariyla kaydedildi"); //buraya else yazmıyoruz


        }
    }




