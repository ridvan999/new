package day21_arrayList_forEachLoop;

public class C05_KarelerinToplami {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 0, 1};
        // Soru 2- Verilen int array’deki her elementin karelerini alip,
        //         karelerinin toplamini yazdiran bir method olusturun.
        int toplam=0;

        for (int each:arr
             ) {
            toplam+=each*each;
            
        }
        System.out.println(toplam);
            
    }

}
