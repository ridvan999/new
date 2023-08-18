package day12_forLoops;

public class C02_ForLoop {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

     /* FOR LOOPSUZ ÇÖZUM
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen başlangıç ve bitiş değerleri için 2 pozitif tam sayi giriniz");
        System.out.println("lutfen ilk degeri giriniz");
        int sayi1=scan.nextInt();
        System.out.println("lutfen ikinci degeri giriniz ");
        int sayi2=scan.nextInt();
        if(sayi1>sayi2){
            System.out.println("baslangıç degeri bitis degerinden buyuk olamaz");
        } else
        {System.out.println("girdiginiz degerlerin toplami: "+ (sayi1+ sayi2));}
         */
            int bas=40;
            int bit=41;
            int sayilarToplami=0;
            if (bas>=bit) {
                System.out.println("baslangıc degeri bitis degerinden kucuk olmali");
            }
            else
            {
                for (int i = bas; i <= bit; i++) {
                    sayilarToplami+=i;

                }
                System.out.println("sayilar toplami: " +sayilarToplami);

                }





    }
}




