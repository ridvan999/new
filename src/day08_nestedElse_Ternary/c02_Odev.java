package day08_nestedElse_Ternary;

import java.util.Scanner;

public class c02_Odev {
    public static void main(String[] args) {

         /*
                Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
                kullaniciya musteri karti olup olmadigini sorun.
                Musteri karti varsa 10 urunden fazla alirsa  %20,
                yoksa %15 indirim yapin,
                Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen adedini ve fiyatını giriniz");
        System.out.println("lütfen adedini  yazınız:");
        double adet= scan.nextDouble();
        System.out.println("lütfen fiyatını giriniz");
        double fiyat= scan.nextDouble();
        System.out.println("musteri kartınız var mı? varsa e yoksa h yazınız");
        char kart = scan.next().charAt(0);
    if(kart=='e'||kart=='E')
            if(adet>10){
                System.out.println(adet*fiyat*0.80+" toplam yüzde 20 indirim kazandınız");}
                   else{
                        System.out.println(adet*fiyat*0.85+ " toplam yüzde 15 indirim kazandınız");}

    else if (kart=='h'||kart=='H')
            if(adet>10){
                System.out.println(adet*fiyat*0.85+ " toplam yüzde 15 indirim kazandınız");}
                else{
                    System.out.println(adet*fiyat*0.90+ " toplam yüzde 15 indirim kazandınız");}
    else {
            System.out.println("yanlış bilgi girdiiniz");  }


                    }


}
