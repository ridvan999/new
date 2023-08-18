package day04_dataCasting_wrapperClasses;

public class c01_AsciiTable {
    public static void main(String[] args) {
        /*

        a==> 97===>
        b===> 98

        *** char data turundeki variable ve değerler
        sayısal data tğrlerine atanırsa veya sayısal data türündeki datalarla
        işleme sokulursa ascciitable daki değerleri ile işleme girer
         */
        System.out.println(5+ 'a'); //5+97      (97 anın ascii tabledaki yeridir)


        char girilenChar='f';

        System.out.println((char)(girilenChar+1));// biz 103 ü değil de 103 ün karşılığı olan
        // char karşılığını yazdırmak istiyorsak bunu yaparız
        System.out.println(girilenChar);
        System.out.println(girilenChar+2+'a');//deneme



    }
}
