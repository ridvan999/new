package day07_IfElseIfStatements;

import java.util.Scanner;

public class c03_IfElseIfelse {
    public static void main(String[] args) {
        /*
                 Ogrencinin notu 85 ve ustu ise AA,
                (85 ve ustu degilse) 65 ve ustu ise BB,
                (65 ve ustu de degilse) 50 ve ustu ise CC,
                (geriye kalanlar) DD
                */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sınav notunuzu giriniz");
        double not = scan.nextDouble();
        if (not > 100 || not < 0) {
            System.out.println("geçersiz not girdiniz.tekrar giriniz");
        } else if (not >= 85) {
            System.out.println("AA ile geçtiniz");
        } else if (not >= 65) {
            System.out.println("BB ile geçtiniz");
        } else if (not >= 50) {
            System.out.println("CC ile geçtiniz");
        } else System.out.println("Kaldınız");


    }
}




