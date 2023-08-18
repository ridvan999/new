package day28_deneme;

import day28_accessModifier_encapsulation.C03_EncapsuleDatalar;

public class AccessModifierKullanimi {
    public static void main(String[] args) {

        C03_EncapsuleDatalar obj = new C03_EncapsuleDatalar();

        System.out.println(obj.toplamSatis);// read yetkisi
        obj.toplamSatis = 100; // write yetkisi
        System.out.println(obj.a); // public oldugu icin hem read
        obj.a = 100;  // public oldugu icin hem de write

        //  System.out.println(obj.satisTutari);// ulasamiyorum cunku accsess modifier'i farkli
        //  obj.satisTutari = 100; // accses modifier'i default oldugu icin ne ulasabilirim ne read ne de write
        //yapabilirim java buna cok guzel cozum uretmis

        // eger ulasabiliyorsam hem read hemde write yapabiliyorum

        //obj.satisTutari; ---> instance ama C03 classinda bu satisTutarinin default degeri var
        // default access modifierina sahip oldugu icin goremiyorum
        /*
        baska bir class'daki variable veya methoda ulasmak istedigimizde
        ulasmak istedigimiz class uyesinin static olup olmamasi erisim uontemini
        static ise classismi.uye ismi yazarken static degilse obje olusturup obje ismi.classuyesi
        static olup olmamais sadece erişim yontemini etkiler

        ulasmak istedigimiz uyenin accsess modifier ise o uyeye ulasip ulasamayacaigimi belirler
        ulasabilirsek o datayi okuyabilir veya o dataya yeni deger atayabiliriz




         */



    }


}
