package day29_inheritance;

public class C04_Child extends C03_ParentClass {
    int c = 20;
    int a;
    String s = "Child class";
    String m;

    public void method1(){
        System.out.println("child method1 calisti");
    }



    public static void main(String[] args) {
        // child class'inda gidip parent class'indan bir obje olusrabilir miyim evet

        C03_ParentClass objC03 = new C03_ParentClass();
        // parent class'dan olusturdugum bu obje ile bu class'daki m variable'ina ulasabilir miyim
        objC03.a = 20;
        objC03.b = 22;
        objC03.s = "p";
        objC03.t = "k";
        objC03.method1(); // parent method1 calisti
        objC03.method2(); // parent method2 calisti

        // ben child class'inda parent class'indan bir obje olusturdugumda
        // parent class'indaki variable'lara ulasabildim. methodlara'da ulasabildim.

        C04_Child objC04 = new C04_Child();
        objC04.a = 50;
        objC04.c = 20;
        objC04.s = "u";
        objC04.m = "l";
        objC04.method1();  // child method1 calisti

        // extends yaptiktan sonra artık parent classWindaki tum ozelliklere sahibim

        objC04.b = 8; // parent class'indan variable geldi ve deger atayabilirim
        objC04.t ="y";
        objC04.method2(); //

        // peki parent'a yeni bir sey geldi mi ? hayır



        /*
        Java'da parent class'lar chil edilmez child class'lar parent edilir.

        C04 child class'inin C03deki parent class'indaki ozellikleri otomatik olarak
        almak istiyorsak o zaman C04'ü C03'e child yaparsınız.

        C04 class adıinin yanina EXTENDS C03_PARENTCLASS yazarak.

        BİR CLASS'İN BASKA BİR CLASS'DAKİ RUM OZELLİKLERİ OTOMATİK OLARAK
        EDİNMESİNİ İSTİYORSAK class'imzi EXTENDS keyword ile o class'a child yapariz
        (size baba diyebilir miyim sizi parent yaptim)

        C04 class'ini C03'e chilf yapinca chil class'da olmayip parent class'da olan
        b,t ve method2() ozellik olarak onjC04'e eklendi


         Child class'lar parentte olusturulan instance ve static veriabelari görebilirler.
          ancak child icinde ayni isimle olusturulmus bir veriable var ise o parentteki ayni isimli veriable gizler.


         */


    }

}
