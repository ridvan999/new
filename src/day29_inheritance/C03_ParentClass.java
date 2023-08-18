package day29_inheritance;

public class C03_ParentClass {
    // biraz daha farkli ozelliklere sahip class'lardir.
    // genelde main method'lari olmaz. Bazi ozellikleri kapsarlar
    // yani variable ve method'lar

    int a = 10;
    int b;
    String s = "belirtilmemis";
    String t;

    public void method1(){
        System.out.println("parent method1 calisti");
    }
    public void method2(){
        System.out.println("parent method2 calisti");
    }
}
