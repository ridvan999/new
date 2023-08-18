package day28_deneme;

import day28_accessModifier_encapsulation.C01;

public class deneme {
    public static void main(String[] args) {




        C01 obj =  new C01();

        // str' a instance oldugundan obje ile ulasabilir miyim HAYİR.

        //  obj.str = "Fava"; Farkli package'dayiz bunun access modifier'ida default. Farkli package'dan ulasamayiz

        /*
        s'ye ulasmak istiyorum static oldugu icin class'dan direk ulasabilirim
         */
        //  C01.s = "Fava"; // staticde olsa default access modifier farklı package ulasamayiz

        // obj.b = 10; private access modifier

        obj.d = 50;
        C01.a = 30;

        String a="";
        a+=2;
        a+='c';
        a+=null;
        System.out.println(a);
        if (a=="2cfalse"){System.out.println("==");}








    }
}
