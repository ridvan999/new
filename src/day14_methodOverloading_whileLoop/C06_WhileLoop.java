package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //toplamı 500 olana kadar kadar sayı yazdırın ve 500ü geçtikten sonra durdurun


        int girilenSayi = 0;
        int sayilarToplami = 0;
        int girilenSayiAdedi = 0;
        Scanner scan = new Scanner(System.in);
        while (sayilarToplami < 500)
        {
            System.out.println("toplanmak üzere tam sayılar giriniz");
            girilenSayi = scan.nextInt();// sa

            sayilarToplami+=girilenSayi;
            girilenSayiAdedi++;


        }
        System.out.println("toplamda "+girilenSayiAdedi+" sayi girildi ve girilen sayilarin toplami: " +sayilarToplami);

    }

}