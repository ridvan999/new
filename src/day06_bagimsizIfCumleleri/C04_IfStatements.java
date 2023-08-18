package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen ders notunuzu giriniz");
        double not = scan.nextDouble();
        if (not >= 50)
            System.out.println("sınavı geçtiniz");


        if (not < 50); {  System.out.println("malesef kaldınız");

        }

    }
}






 /*
            if statements'da sart parantezinden sonra {} kullanmazsak
            Java ilk ; ' e kadar olan kismi if body olarak kabul eder
            if body zaten bir satir ise bu bir sorun olmaz
            ama if body 1 satirdan coksa, ilk satirdan sonrasi
            her durumda calisir
         */