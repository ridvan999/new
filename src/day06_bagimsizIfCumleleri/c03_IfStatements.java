package day06_bagimsizIfCumleleri;
import java.util.Scanner;
public class c03_IfStatements {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen üçgenin kenarlarını giriniz");
        double sayi1= scan.nextDouble();
        double sayi2 = scan.nextDouble();
        double sayi3= scan.nextDouble();

        if (sayi1==sayi2 && sayi2==sayi3){               /* burada ; simgesi kullanılmaz kullanılırsa
                                                            soutta ne yazarsa konsola onu y azar*/
            System.out.println( "eskenardır");


        }
    }
    }

 /*
            Java'da 3'lu karsilastirma YOKTUR
            Onun yerine ikili karsilastirmalar yapip && ile birlestirebiliriz
         */