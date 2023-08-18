package day07_IfElseIfStatements;

import java.util.Scanner;

public class c06_NestedIfElseEmeklilik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi ve yaşınızı sırasıyla giriniz" +
                "\n Kadın ise k erkek ise e olarak giriniz");
        System.out.print("Cinsiyetiniz: ");
        char cins = scan.next().charAt(0);
        System.out.print("Yasiniz: ");
        double yas = scan.nextDouble();
        if (cins == 'k' || cins == 'K')// kadın için
            if (yas < 0) {
                System.out.println("girilen yas gecersiz");
            } else if (yas < 60) {
                System.out.println("emekli olmaniza " + (60 - yas) + " yiliniz var");
            } else {
                System.out.println("emekli olabilirsiniz");
            }

        else if (cins == 'e' || cins == 'E')
            if (yas < 0) {
                System.out.println("girilen yas geçersiz");
            } else if (yas < 65) {
                System.out.println("emekli olmaniza " + (65 - yas) + " yiliniz var");
            } else {
                System.out.println("emekli olabilirsiniz");
            }
        else {
            System.out.println("girilen cinsiyet geçersiz");
        }
    }
}

/*
*****   EN DIŞTAKİ ELSE/ELSE IF/ELSE CİNSİYETİN ŞARTLARINI    (ANA YAPI)
        İÇERDEKİLER DE CİNSİYETLERİN YAŞA GÖRE SONUCUNU VERİR   (İÇ YAPI)
 */

