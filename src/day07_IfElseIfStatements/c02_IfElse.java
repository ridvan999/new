package day07_IfElseIfStatements;

import java.util.Scanner;

public class c02_IfElse {
    public static void main(String[] args) {
        /*
            Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
            NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
            Kullanici o veya O yazdiginda output Ocak olsun
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char hrf = scan.nextLine().charAt(0);

        if (hrf == 'o' || hrf == 'O') {
            System.out.println("Ocak");
        }

        if (hrf == 's' || hrf == 'S') {
            System.out.println("Subat");
        }

        if (hrf == 'm' || hrf == 'M') {
            System.out.println("Mart, Mayıs");
        }

        if (hrf == 'n' || hrf == 'N') {
            System.out.println("Nisan");
        }

        if (hrf == 'h' || hrf == 'H') {
            System.out.println("Haziran");
        }

        if (hrf == 't' || hrf == 'T') {
            System.out.println("Temmuz");
        }

        if (hrf == 'a' || hrf == 'A') {
            System.out.println("Ağustos,  Aralık");
        }

        if (hrf == 'e' || hrf == 'E') {
            System.out.println("Eylül,  Ekim");
        }

        if (hrf == 'k' || hrf == 'K') {
            System.out.println("Kasım");
        }


    }
}
