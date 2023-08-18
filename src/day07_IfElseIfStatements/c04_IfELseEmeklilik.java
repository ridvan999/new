package day07_IfElseIfStatements;

import java.util.Scanner;

public class c04_IfELseEmeklilik {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri ,
        Erkek 65  yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi ve yaşınızı sırasıyla giriniz");
        System.out.print("Cinsiyetiniz(kadınsa 'k', erkek ise 'e' yazınız): ");
        char cins= scan.nextLine().charAt(0);
        System.out.print("Yasiniz: ");
        double yas= scan.nextDouble();
        if(yas>=60  && cins=='k'||yas>=65  && cins=='e') {
            System.out.println("Emekli olabilirsiniz");}

        else if(cins=='k'&& yas<60){
            System.out.println("emekli olmanız için "  + (60-yas)  +" yıl daha çalışmanız gerekmektedir");}
        else if(cins=='e'&& yas<65){
            System.out.println("emekli olmanız için "  + (65-yas)  +" yıl daha çalışmanızgerekmektedir");}



    }
}
