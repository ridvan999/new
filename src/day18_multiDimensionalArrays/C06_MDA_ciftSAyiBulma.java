package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C06_MDA_ciftSAyiBulma {
    public static void main(String[] args) {
        // Bir String'i istedigimiz parcalara ayirmak icin kullanilir
        String str= "Java candir can, bundan suphesi olan var mi?";
        // str kac kelimedir?
        String[] kelimeler= str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, candir, can,, bundan, suphesi, olan, var, mi?]
        System.out.println("kelime sayisi : " + kelimeler.length);
        // en uzun kelime kac harflidir ?
        int enUzunKelimeLength=kelimeler[0].length();
        System.out.println("en uzun  "+enUzunKelimeLength);// 1. kelime tani java kelimesinin length i
        for (int i = 0; i < kelimeler.length ; i++) {
            if (kelimeler[i].length()>enUzunKelimeLength){
                enUzunKelimeLength= kelimeler[i].length();
            }
        }
        System.out.println("En uzun kelimenin karakter sayisi : " + enUzunKelimeLength);
        // bir string'i karakterlerine ayirmak istersek
        String[] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));
        System.out.println("Cumledeki karakter sayisi : " + karakterler.length);
    }
}
