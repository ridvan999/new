package day07_IfElseIfStatements;

import java.util.Scanner;

public class c05_NestedIfElseStatementsEmeklilik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi ve yaşınızı sırasıyla giriniz");
        System.out.print("Cinsiyetiniz: ");
        String cins = scan.nextLine();
        System.out.print("Yasiniz: ");
        double yas = scan.nextDouble();
        if (yas < 0|| yas>100) {
            System.out.println("girilen yas gecersiz");
        } else if (!(cins.equalsIgnoreCase("kadin") || cins.equalsIgnoreCase("erkek"))) {
            System.out.println("girilen cinsiyet geçersiz");
        } else if (cins.equalsIgnoreCase("kadin") && yas >= 60) {
            System.out.println("emekli olabilirsiniz");
        } else if (cins.equalsIgnoreCase("kadin") && yas < 60) {
            System.out.println("emekli olmanıza " + (60 - yas) + " yılınız  kalmıistir");
        } else if (cins.equalsIgnoreCase("erkek") && yas >= 65) {
            System.out.println("emekli olabilirsiniz");
        } else if (cins.equalsIgnoreCase("erkek") && yas < 65) {
            System.out.println("emekli olmanıza " + (65 - yas) + " yılınız  kalmıistir");

        }

    }
}
