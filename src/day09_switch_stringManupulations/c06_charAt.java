package day09_switch_stringManupulations;

public class c06_charAt {
    public static void main(String[] args) {
        String str = "Java Candir";
        System.out.println(str.charAt(0)); // J
        System.out.println(str.charAt(5));// bastan 6.harfi yazdirin
        System.out.println(str.charAt(str.length()-2));// sondan 2.harfi yazdirin
                                            // (toplam karakter sayısın 1 eksiğini yazdıktan sonra
                                            // sondan kaçıncıyı istiyorsa o kadar eksiltiriz onu yazarız )
        System.out.println(str.charAt(10));// son harfi yazdirin
                                            //toplam 11 karakter olduğu için 1 eksilttik
         System.out.println(str.charAt(11)); // StringIndexOutOfBoundsException

        /*
            Java'da 2 turlu hata ile karsilasabiliriz
            1- syntax olarak hatali yazilan kodlari Java compile ederken anlar ve altini kirmizi cizer
                str = 23; String bir variable'a int deger atanamayacagini bilir ve altini kirmizi cizer
                CompileTimeError (CTE) diyoruz
             2- Bazen de syntax'de hata olmaz
                Java sorunu calismaya basladiktan sonra farkeder
                str.charAt(15) : burada verilen str'dan bir karakter isteniyor
                compile time'da str'in uzunlugunu Java anlamaz
                ama calisinca 15.index'in olmadigini farkeder ve exception firlatir
                RunTimeError (RTE) deriz
         */

    }
}
