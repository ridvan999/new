package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class c02_AsciiTable {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        char girilenHarf= scan.next().charAt(0);
        System.out.println("girilen harf:"+ girilenHarf+
                "\ngirilen harften sonraki 3 harf:"+ (char)(girilenHarf+3));

    }
}
