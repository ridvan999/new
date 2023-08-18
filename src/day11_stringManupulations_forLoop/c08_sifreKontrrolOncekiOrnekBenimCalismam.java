package day11_stringManupulations_forLoop;

import java.util.Scanner;

public class c08_sifreKontrrolOncekiOrnekBenimCalismam {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sifre giriniz");
        String sifre=scan.nextLine();


        //Soru 4 : Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve
        // kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali
        // soruyu if else ile yaparsak sadece 1 hata yazdirir, otekilere bakmaz
        // bagimsiz 4 if-else cumlesi olmali
        // en sonda 4 sarti'da sagladigini kontrol eden bir variable kullanacagiz
        int flag=0;// her run ettiğimde deneme sayısını 0 dan başlatmamız için bunu yapmalıyız

        // - ilk harf kucuk harf olmali

        if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z')//girilecek ilk karakterin  yerinin ve sınırlarının komutunu
                                                        // belirleyen şart
        /****   yukarıdaki komut su sekilde de verilebilirdi:
         *      char ilkHarf=sifre.charAt(0); ----1- once ilk karakter tanimlanirdi
         * if (ilkHarf>='a' && ilkHarf<='z')----  2- sonra da if li komutla sınırları belirlenirdi
         *                                          biz bunu yapmak yerine tek if in icine hem kacinci karakter
         *                                          olması gerektiğini hem de o karakterin sınırlarını çizdik.*/
        {
            flag++;
        }else{
            System.out.println("ilk karakter kucuk harf olmali");
        }


        // - son karakter rakam olmali

        if (sifre.charAt(sifre.length()-1)>='0'  &&  sifre.charAt(sifre.length()-1)<='9')//girilecek karakterin  yerinin ve
                                                                                        // sınırlarının komutunu belirleyen komut

        {
            flag++;
        }else{
            System.out.println("son karakter rakam olmali");
        }
        // - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
        }else{
            flag++;
        }
        // - uzunlugu en az 10 karakter olmali
        if (sifre.length()>=10){
            flag++;
        }else{
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmalidir");
        }
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        if (flag==4){
            System.out.println("sifre basariyla kaydedildi");

        }
    }
}
