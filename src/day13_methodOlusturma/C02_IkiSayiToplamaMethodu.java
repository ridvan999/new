package day13_methodOlusturma;
import java.util.Scanner;
public class C02_IkiSayiToplamaMethodu {
    public static void main(String[] args) {
        // kullanicidan 2 sayi alip
        // toplamlarini yazdiran bir method olusturun
        ikiSayiTopla();//bunu alt alta kaç defa yazarsam o kadar scan olusturur ve çıktı yazar.
                        // buna method call diyoruz

    }
    public static void ikiSayiTopla(){  //sadece yazdıracaksak voidi kullanırız
                                         //public static simdilik boyle kalsin. ilerde gorcez
                                        //metodun ismine istedigimizi yazabiliriz
                                        //fakat anlasilir olsun diye ikiSayiTopla dedik
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplamak uzere 2 sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("Iki sayinin toplami : " + (sayi1+sayi2));
    }
}