package day08_nestedElse_Ternary;

import java.util.Scanner;

public class c01_artikYil {
    public static void main(String[] args) {

         /*
//                Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
//                Kural 1: 4 ile bolunemeyen yillar artik yil degildir
//                Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
//                Kural 3: 4’un kati olmasina ragmen 100 ile
//                bolunebilen yillardan sadece 400’un kati olan yillar artik yildir
//        */         Scanner scan=new Scanner(System.in);
                    System.out.println("lütfen bir yıl giriniz");
                    int sayi= scan.nextInt();
                    if (sayi%4!=0){
                        System.out.println("girdiğiniz yil artik yil degildir");}
                    else if ( sayi%100!=0){
                        System.out.println("girilen yil artik yildir");}
                    else if (sayi%400==0 ){
                        System.out.println("girilen yil artik yildir");}
                    else {
                        System.out.println("Artik yil degildir");

                    }


    }
}
