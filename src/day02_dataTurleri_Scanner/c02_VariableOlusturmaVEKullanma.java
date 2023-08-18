package day02_dataTurleri_Scanner;

public class c02_VariableOlusturmaVEKullanma {
    public static void main(String[] args) {
        int sayi ;
        sayi =20;
        System.out.println(sayi); // burda çıktıyı istediğimizde sayıyı yazar
        System.out.println("sayi"); // çıktıyı istediğimizde sayı kelimesini yazar

        sayi= 30; /* 20 olan sayıyı artık görmez sayı değeri 30dan devam eder.
        yani deklerasyon sadece 1 kere verilir */

        sayi=30;
        sayi= 2* sayi + 20;
        System.out.println(sayi);

    }
}
