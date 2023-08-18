package day28_accessModifier_encapsulation;

public class C01 {
    String str; // default access modifier
    // gorunurde access modifier yok. Defatult yazamayiz zaten defaut ben yaptim diyor
    // class level'daki her class uyesinin access modifier OLUR.
    // eger access modifier gorunmuyorsa Java o class uyesini default access modifier olarak
    // isaretler.
    // her default birbiri ile ayni degildir.
    // variable'in default degeri var, acces modifier yok ama access modifier default degeri var
    // bu class'da constructor yok, o zaman default constructor vardir.
    // default'un yanindaki degere dikkat edecegiz
    static  String s; // default acces modifier.

    public int sayi;

    public static int a;
    public int d;
    private int b;
    private static  int c;




    public static void main(String[] args) {
        int sayi = 10;
        // public int sayi2 = 20;
        //  static String b;
        // Bir method icerisinde public, protected, privite gibi acces modifier'lar
        // veya static keyword KULLANILAMAZ. Bunlar class leveldeki method ve variable'lar icin gecerlid

        //  System.out.println(b); // privite olan b ye ulasabilirim ama main static method o yuzden kabul etmedi
        System.out.println(c); // static her yere gider
        System.out.println(s);

        // str ve s icin dusunursem deger atayalim
        // str = "Java"; // str static degil main method static
        s ="hava"; // static problem yok

        a = 10; // static
        // d = 20; // method static variable instance


    }
    void method1(){ // ne public ne de static var Java mudahele etmiyor.default acces modifire
        System.out.println(b); // b instance bu methodda instance kabul eder
        System.out.println(c); // static her yere gider

        str = "Java"; // instance method instance
        s ="hava"; // static her yere gider

        a = 10; // static her yerden ulasilabilir
        d = 20; // instance zaten instance method
    }
    static  void method2(){

    }
    public void method3(){

    }

}
