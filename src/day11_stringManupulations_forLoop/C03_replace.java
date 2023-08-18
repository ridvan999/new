package day11_stringManupulations_forLoop;

public class C03_replace {
    public static void main(String[] args) {
        String str = "Java Candir";
        System.out.println(str.replace('J', 'H')); // Hava Candir
        System.out.println(str.replace("a", "")); // Jv Cndir
        System.out.println(str.replace("Java","X")); // X Candir
        System.out.println(str.replace("v","yayaya")); // Jayayayaa Candir
        str.replace("va","lala");   // yapilan degisiklik bu satir icindir   Result of 'String.replace()' is ignored
                                                    // yazdirilmadigi icin gormeyiz
                                                    // atama yapilmadigi icin de kalici olmaz
                                                    //sag ust kosede de bu komutun ignore edildigini belirtiyor (sağ üstteki ünleme basınca)
                                                    // Result of 'String.replace()' is ignored
        System.out.println(str);                    // bir yukarıda str'ye atama yapmadığımız icin yazdırmadı

        str= str.replace(" ","");  // ****str'daki space'leri yok ettik.atamamızı da yaptığımız için
        System.out.println(str); // JavaCandir
        System.out.println(str.replaceFirst("a", "")); // JvaCandir  //ilk gördüğü a nın yerine hiçlik getirdi
        System.out.println(str.replaceFirst("C", "K")); //JavaKandir



    }
}
