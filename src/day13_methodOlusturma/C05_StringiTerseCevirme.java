
package day13_methodOlusturma;
public class C05_StringiTerseCevirme {
    public static void main(String[] args) {
        // Verilen bir String'i tersine cevirip
        // bize donduren bir method olusturun
        System.out.println(stringTersineCevir("Java Candir"));
        System.out.println(stringTersineCevir("Anlasildi mi?"));
        System.out.println(stringTersineCevir("Soyle Omer"));
        String sonuc=C05_StringiTerseCevirme.stringTersineCevir("merhaba");
        System.out.println(sonuc);
        System.out.println(sonuc.length()-1);
        System.out.println(sonuc.charAt(sonuc.length()-1));
    }
    public static String stringTersineCevir(String metin){ // Java

        String tersMetin=""; // avaJ
        for (int i =metin.length()-1  ; i >=1 ; i--) {  //sonuncu indexten 0 ıncı indekse kadar git dedik

            tersMetin += metin.substring(i-1,i);           // charAt son indeksten char At  ıncı indekse kadar olan kadar
                                                    //ekle dedikcbv
        }
        return tersMetin;
    }

}