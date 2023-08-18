package day11_stringManupulations_forLoop;

public class C04_replaceAll {
    public static void main(String[] args) {
        String str = "J1a23va34 5C54and65ir87";
        // str'daki sayilari method'la temizleyin
        /*
            Eger degistirmek istedigimiz metin tek bir metin degil,
            ortak ozelligi olan farkli metinlerse
            - tum sayilar
            - sayi olmayanlarin tumu
            - tum space'ler
            - space olmayan tum karakterler
            bu ortak ozellikleri belirtmek icin Java regex tanimlamistir
         */
        System.out.println(str.replaceAll("\\d","" ));
                    /*  Regex (Regular Expressions)
                \\s : space \\S : space olmayan hersey
                \\s+ : yanyana birden fazla space
\               \\d : digits \\D : digit olmayan hersey
\              \\w : harf veya rakam \\W : harf veya rakam olmayan hersey
                                                                    */
        System.out.println(str.replaceAll("\\s",""));
        System.out.println(str.replaceAll("\\S","Java iyidir"));
        System.out.println(str.replaceAll("\\w","java guzeldir"));
        System.out.println(str.replaceAll("\\d",""));
        System.out.println(str);

        str=str.replaceAll("\\d","");
        System.out.println(str);





    }
}
