package day28_deneme;

import day28_accessModifier_encapsulation.C03_EncapsuleDatalar;

public class EncapsulationKullanim {

    public static void main(String[] args) {


        System.out.println(C03_EncapsuleDatalar.getIsim()); // Yildiz Pazarlama


        // private olan string isim variable icin code-generet-getter-variable'i sec
        // get methodu olusturuyor. Bu method ile yazdırabiliyorum. Deger atayamam ama görebilirim


        /*
        Peki deger atayabileyim ama goremeyeyim bunun icinde setter()

        satis tutarini instance oldugu icin obje uzerinden buraya eklemek istiyorum
         */
        C03_EncapsuleDatalar obj = new C03_EncapsuleDatalar();
        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);

        System.out.println("Toplam satis tutari : "+obj.toplamSatis);


    }
}

/*
  C03_EncapsuleDatalar class'indaki isim variable'inin degeri gorunsun ama degistirilemesin
  satisTutari ise deger girilebilsin ama girilen degerler sonradan gorulemesin


  Eger bir variable icin read veya write ozelliklerinin birbirinden ayrilmasi isteniyorsa
  oncelikler access moodifier ile kimsenin ulasamamasini saglayin

  private yaparak kimsenin ulasamayacagini garantiye aldikdan sonra
  READ yetkisi vermek icin getter() methodu
  WRİTE yetkisi vermek icin setter() methodu olusturmaliyiz



  Butun datalari encapsule etmek zorunda degilim ihtiyac olursa kullanabiliriz.


  Encapsule icin read ve write olarak bibirinden ayırma yetkisi icin
  istedigimiz variable'i private yapariz sonra getter read icin setter da write yetkisi icin
  kullandik. private olan bir seyin static olmasinin hicbir anlami yok baska yerden ulasmak anlaminda


  Setter()---> yazdirma yetkisi. deger atamasi yapabilirim ama yazdiramam
  Getter() ---> okuma yetkisi. Gorebilirim ama deger atamasi yapamam.


  ENCAPSULATION = BİR CLASS'DAKİ CLASS UYELERİNE ERİSİM YETKİSİNİ
                  READ VE WRİTE OLARAK BİRBİRİNDEN AYİRMADİR.



 */