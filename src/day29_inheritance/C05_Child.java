package day29_inheritance;

public class C05_Child extends C03_ParentClass {
    int c = 20; // yeni ekledim
    int a; // uptade ettim
    String s = "Child class"; // uptade ettim
    String m;

    public void method1(){ // uptade yaptik
        System.out.println("child method1 calisti");
    }


    public static void main(String[] args) {
        /*
şuanda bu class parent class'in child'imi degil.
child yazip buradan class isiminin yanina extends yazip
parent class i eklemem lazim

extends C03_ParentClass artık bu class child class

chil class'dan bir obje olusturalim ve ozelliklerini
yazdiralim

 */

        C05_Child obj = new C05_Child();
        System.out.println(obj.a); //0

        //obje once kendi scope'unu kontrol ediyor bu class'da
        //a variable var deger atanmamis. default degeri 0 yazilacak

        System.out.println(obj.c); // 20. once bu class'dan bakti
        System.out.println(obj.b); // 0
        // b bu class'da yok. extends yaptik bu yuzden parents
        // class'indaki ozellikler otomatik gecti yazmasak gecmezdi
        // bu class'da b variable yok parents class'indaki
        // degeri bakacak onu yazdiracak

        System.out.println(obj.m); // null
        // bu class'da m var ve degeri null

        System.out.println(obj.s); // Child class


        /*
        s bu class'da da var parents class'indada var
        oncelik kendi class'indan aliriz bu daha guncel.
         */
        System.out.println(obj.t); // null

        obj.method1(); // child method1 calisti
        obj.method2(); // parent method1 calisti

        /*
        bazi ozellikleri parent class'indan aldik
        bazi ozellikleri uptade ettik
        bazı ozellikleri kendi child class'imizda tanimladik
         */


    }
}
