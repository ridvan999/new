package day13_methodOlusturma;

import day15_doWhileLoop_scope.C02_RakamlarToplaminiBul_methodCagir;

public class C03_Faktoryel {
    public static void main(String[] args) {
        // verdigimiz bir sayinin faktoryelini hesaplayip
        // sonucu bize donduren bir method olusturun
        // methodlar classın icinde main metodun dışında olusturulur
        // C02_IkiSayiToplamaMethodu.ikiSayiTopla(); seklinde baska classtaki baska metodu calıstırabiliriz

        int sonuc = C03_Faktoryel.faktoriyelHesapla(8);
        System.out.println(sonuc);
        /*
                Method olusturma asamalari
                1- public static standart (simdilik)
                2- olusturdugumuz method bize bir sonuc dondurecekse
                   dondurecegi sonucun data turunu yaz
                3- method ismi
                4- method parantezi () icine method'a gondermemiz gereken bilgileri
                   hangi variable ile gonderecegimizi yaz (parametre)
                5- dondurulmesi istenen islemi yap
                6- return keyword kullanarak dondurulmesi istenen degeri dondur
         */
    }

    public static int faktoriyelHesapla(int sayi) {
        int faktoriyel = 1;
        for (int i = sayi; i >= 1; i--) {
            faktoriyel = faktoriyel * i;


        }


        System.out.println("yazılan sayının faktoryel değeri:  " +faktoriyel);
        return faktoriyel;

    }

}


