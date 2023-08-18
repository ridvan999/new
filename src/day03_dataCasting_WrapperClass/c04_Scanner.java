package day03_dataCasting_WrapperClass;

import java.util.Scanner;

public class c04_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //kullanıcıdan çemberin yarıçapını alıp çevresini ve alanını bulalım
        System.out.println("lütfen çemberin yarıçapını  girin");

        double yaricap= scan.nextDouble();
        System.out.println("çemberin çevresi: "+ 2*3.14*yaricap);
        System.out.println("dairenin alanı: "+yaricap*yaricap*3.14);


    }
}
