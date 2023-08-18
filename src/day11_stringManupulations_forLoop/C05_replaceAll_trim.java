package day11_stringManupulations_forLoop;

public class C05_replaceAll_trim {
    public static void main(String[] args) {

        String str = "    J&ava54 C+an01dir,,,     ";
        // str'i Java Candir haline getirin
        str=str.trim();//bastaki ve sondaki spaceleri kaldırdı


        str= str.replaceAll("\\d","");
        System.out.println(str);  // J&ava C+andir,,,//digitler silindi

        str= str.replaceAll(" ","5");
        System.out.println(str);//J&ava5C+andir,,,// bosluk yerine 5 yazıldı

        str= str.replaceAll("\\W","");
        System.out.println(str);// Java5Candir //rakam ve harf disindaki karakterler gitti


        str= str.replaceAll("5"," "); // Java Candir
        System.out.println(str);







    }
}
