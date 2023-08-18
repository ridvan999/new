package day05_IncrementDecrement_Concatenation;

public class c01_IncrementDecrement {
    public static void main(String[] args) {
        int a = 20;

        // a'nin degerini 3 artirin ve yeni degerini olusturacaginiz b variable'ina atayin
        a+= 3;  // a=23
        int b=a; // şimdi b yi 23 yaptık


        b=a;
        a += 3;// a 26 , b de 23 oldu
        System.out.println( "a : " + a +", b : " + b); // a : 23, b : 20
        System.out.println("==============");
        a=20;
        // a'nin degerini yazdirin ve sonra a'yi 5 artirin
        System.out.println("a : " + a);
        a += 5;
        // burada a'yi yazdirsak 25 yazardi
        System.out.println("==============");
        a=20;


        // a'nin degerini 2 azaltin ve sonra a'nin degerini yazdirin
        a -= 2 ;
        System.out.println("a : " + a); // 18




    }
}
