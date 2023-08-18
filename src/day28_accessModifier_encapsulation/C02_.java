package day28_accessModifier_encapsulation;

public class C02_ {
    public static void main(String[] args) {


        // System.out.println(C01.b); // once uzerinden ulasmaya calisalim
        // System.out.println(C01.c);

        C01 obj = new C01();
        //System.out.println(C01.b); // acces modifier private
        // System.out.println(C01.c); // acces modifier private

        // Access mofidifer oldugu icin ulasilamiyor. İster static olsun ister olmasin
        // ister direk ulasmaya calisalim istersek obje uzerinden ulasalim kabul etmez
        // cunku access modifier PRİVATE.

        // obje uzerinden diger class'dan default degere ulasalim

        obj.str = "tava"; // icinde bulundugumuz package'dan ulasabiliyoruz
        System.out.println(C01.s);
        /*
        obje uzerinden acces modifier'i default olan C01 deki str'a ulastim ve
        degerini degistirebildim atama yaptim.

        S 'e deger atamasi yapmam icin objeye ihtiyacim var mi = HAYIR
        cunku static direk ulasabilirim
         */

        C01.a = 50;

        // d instance obje uzerinden ulasabilirim

        obj.d = 40;

        // aynı package uzerinden olduklari icin rahatlikla ulasabildik





    }
}
