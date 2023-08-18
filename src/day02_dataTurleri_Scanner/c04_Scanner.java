package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class c04_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan ismini alalım. ve bunu ekrana büüyük harflerle yazdoralım

        // kullanıcıdan deger almak icin 3 adım gereklidir


        //1. adım scanner objesi olusturmak
        Scanner scan = new Scanner(System.in); // ***ezberle burayı her zaman aynı olacak bu kısmı
        // 2. adım kullanıcıya ne istediğimizi söyleyelim
        System.out.println("isminiz nedir?");
        //3.adım kullanıcının gireceği değeri kaydedeceğiniz bir variable olusturun
        //olusturdugunuz variable a atayın

        String girilenIsim = scan.next();
        //artık kullanıcının girdiği değer girilenisimin variable ında kayıtlı
        System.out.println(girilenIsim.toUpperCase());




    }
}
