package day12_forLoops;

public class C05_Faktoryel2 {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin.
        //       Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //       Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        int sayi = 1 ;
        int faktoryel= 1;
        System.out.print(sayi+"! = ");//       6! =
        for (int i = sayi; i >0; i--) {
            faktoryel=faktoryel*i;
            if (i<=0)
                System.out.print("yanlış giriş");
            else if (i==1)
                System.out.print(i +" ");
            else
                System.out.print(i+" * ");
        }
        System.out.println("= "+faktoryel);


    }
}
