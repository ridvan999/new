package day12_forLoops;

public class C06_StringiTerseCevirme {
    public static void main(String[] args) {
        String input="Java Candir";
        String output="";

        for (int i = input.length()-1 ; i >=0 ; i--) { // i'nin sınırı lenght-1 yani 10dan  0 a kadardır
                                                        // her seferinde indeks sıfırlanıncaya kadar
            output += input.charAt(i);  //charın  son indexinden yazdırmaya başlayıp
                                        // döngü her bittiğinde outputa sondan bir sondan iki şeklinde ekleyerek gider

        }

        System.out.println(output);
        System.out.println(input.length()-1); //index sırasını verir
        System.out.println(input.charAt(10)); //o indexteki karakteri verir

    }
}
