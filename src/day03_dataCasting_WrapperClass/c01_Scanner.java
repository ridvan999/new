package day03_dataCasting_WrapperClass;

import java.util.Scanner;
import java.util.StringJoiner;

public class c01_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan ismini soy ismini yaşını yazdırıp aşağıdaki formatta çıktı alıyoruz
        //isminiz: John
        //Soyisminiz: Doe
        //Yasiniz: 44
        //Kayıt basariyla tamamalandi
        Scanner scan = new Scanner(System.in);
        System.out.println("isminiz?");
        String isim= scan.nextLine();   // burada nextline 1 kelimeden fazla olabilir deme
                                       // sadece next deseydik 1 kelime yazabilirdik
        System.out.println("soyisminiz");
       String soyisim = scan.next();

        System.out.println("yasiniz?");
        double Yas = scan.nextDouble();

        System.out.println("isminiz:" + isim);
        System.out.println("soyisminiz: " + soyisim);
        System.out.println("yasiniz: " + Yas);
        System.out.println("kaydınız başarıyla tamamlanmıştır");

    }
}
//****kullanıcı istediğimiz data türünde bilgi girişi yapmazsa
//kodumuzda hata oluşur. o hatanın yeri de gösterilir
//print ln yerine sadece print yazsaydık yazan yazılar yanyana bitişik görünürdü
// tek bir systemoutprintln ile bunu gerçekleştirmek için: \n ve satır sonlarına + yazılır
//        System.out.println("\nisminiz:" + isim+
//        System.out.println("\nsoyisminiz: " + soyisim+
//        System.out.println("\nyasiniz: " + Yas+
//        System.out.println("\kaydınız başarıyla tamamlanmıştır");
//yani String bir ifadenin içine yani çit tırnağın içinde nereye koyarsanız oradan aşağı satıra geçer.
// +  ifadesinin yanına boşluk bırakırsak bir şey değişmez ama string igfadelerin içinde boşluklar yansır
