package day11_stringManupulations_forLoop;

public class C10_ForLoop {
    public static void main(String[] args) {
        // 50'den baslayip, 100'e kadar(100 dahil)
        // sayilari yan yana, aralarinda bir bosluk olacak sekilde yazdirin
        for (int i = 50; i <= 100; i++) {
            System.out.print(i + " ");
        }
        // 3 basamakli sayilardan 23 ile bolunebilenleri
        // yan yana, aralarinda bir bosluk olacak sekilde yazdirin
        System.out.println("");// bunu yapmamızın sebebi alt satıra geçirip yeni sonuçları alt satırda görmek
        for (int i = 100; i <=999 ; i++) {
            if (i % 23 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        // 100'den baslayarak 1'e kadar (sinirlar dahil)
        // 7 ile bolunebilen sayilari yazdirin
            for (int i =100; i >=0 ; i--) {
                if (i%7==0) {
                    System.out.print(i+" ");
                }
            }
    }
}

