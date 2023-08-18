package day12_forLoops;

public class C10_NestedForLoop {
    public static void main(String[] args) {
        /*
                Verilen satir sayisina gore
                asagidaki sekli olusturan kod yaziniz

                * *
                * * *

                * * * * *
                * * * * * *
         */
        int satir= 6;
        for (int i = 2; i <=satir ; i++) { // satirlar Outer Loop / dis Dongu
            for (int j = 1; j <= i ; j++) { // sutunlar inner Loop / ic dongu
                if (i!=3)// yaparak yazdırılınca i'deki satırı yazdırmaz
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
