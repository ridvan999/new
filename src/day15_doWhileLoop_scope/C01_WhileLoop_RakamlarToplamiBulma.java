package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C01_WhileLoop_RakamlarToplamiBulma {
    public static void main(String[] args) {
        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun
        Scanner scan= new Scanner(System.in);
        System.out.println("Rakamlari toplanacak pozitif tamsayi giriniz");
        int girilenSayi= scan.nextInt();

       int sayi=girilenSayi;
       int birlerBasamagi=0;
       int rakamlarToplami=0;
       while(sayi>0)
       {
           birlerBasamagi=sayi%10;
           rakamlarToplami=rakamlarToplami+birlerBasamagi;
           sayi=sayi/10;
       }

        System.out.println("rakamlar toplami: "+rakamlarToplami);
       }

    }
