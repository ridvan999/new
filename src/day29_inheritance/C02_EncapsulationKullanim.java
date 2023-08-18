package day29_inheritance;

public class C02_EncapsulationKullanim {
    public static void main(String[] args) {

        // C01'deki isim ve sayiya ulasmak icin instance
        // olduklari icin obje olusturuyorum

        // isim variable'ina hem read hemde write yetkim var
        // cunku public

        C01 obj = new C01();



        // isim variable'ina hem read hemde write yetkim var
        // cunku public

        obj.isim ="Zeynep"; // write
        System.out.println(obj.isim); // read

        // sayi icin ;
        obj.setSayi(40); // write
        System.out.println(obj.getSayi()); // read

        /*
        bir class uyesinin public olmasi ile
        private yapilip getter ve setter methodlarinin olusturulmasi
        islevsel acidan aynı sonucu olusturur.


        Bazi developer'lar set(write) ve get(read) yetkilerinin
        kullanildigini vurgulamak icin 2. yontemi
        tercih ederler.
         */


    }
}

