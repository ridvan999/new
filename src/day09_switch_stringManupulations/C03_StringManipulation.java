package day09_switch_stringManupulations;

import java.util.Locale;

public class C03_StringManipulation {
    public static void main(String[] args) {
        //

        String str= "Java Candir";
        // str'i buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase()); // JAVA CANDIR
        System.out.println(str); // Java Candir
        // String manipulation yaptiktan sonra, asil variable'a atama yapilmazsa
        // asil variable degismez
        str = str.toUpperCase();
        System.out.println(str); // JAVA CANDIR
        System.out.println(str.toLowerCase()); // java candir
        // str'i turkce karakterleri goz onunde bulundurarak kucuk harfe cevirin
        str = str.toLowerCase(Locale.forLanguageTag("TR"));
        System.out.println(str); // java candır,
        str=str.toLowerCase();
        System.out.println(str);




    }
}
