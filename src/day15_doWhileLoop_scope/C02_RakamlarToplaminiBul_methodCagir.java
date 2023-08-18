package day15_doWhileLoop_scope;

public class C02_RakamlarToplaminiBul_methodCagir {
    public static void main(String[] args) {

        System.out.println(rakamlarToplaminiBul(1532));// çalıştı
    }
    // verilen pozitif bir tamsayinin
    // rakamlar toplamini bize döndüren method olusturun
    public static int rakamlarToplaminiBul(int verilenSayi){ //56781
        int sayi=verilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int basamakSayisi= (sayi +"").length(); //5 // sayıyı hiçlikle toplayıp length ini alınca
                                                    // int degerin kac basamakli olacaginı bulduk
        for (int i = 1; i <=basamakSayisi ; i++) {
            birlerBasamagi= sayi%10;
            rakamlarToplami +=birlerBasamagi;
            sayi /=10;
        }
        return rakamlarToplami;
    }
}
