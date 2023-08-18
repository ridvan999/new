package day07_IfElseIfStatements;

import java.util.Scanner;

public class c01_IfElse {
    public static void main(String[] args) {
        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi
        // 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen boyuunuzu ve kilonuzu giriniz");
        System.out.println("lütfen boyunuzu cm cinsinden yazınız:");
        double boy= scan.nextDouble();
        System.out.println("lütfen kilonuzu giriniz");
        double kilo= scan.nextDouble();


        double index= kilo*10000/(boy*boy);
        if(index>30)
            System.out.println("vücut kitle endeksiniz="+ index+ "  obezsiniz");
        else if (index>25)
            System.out.println("vücut kitle endeksiniz="+ index+ "   kilolusunuz");
        else if(index>20)
            System.out.println("vücut kitle endeksiniz="+ index+ "   normailsiniz");
        else  System.out.println("vücut kitle endeksiniz="+ index+ "   zayıfsınız");
                }

}
