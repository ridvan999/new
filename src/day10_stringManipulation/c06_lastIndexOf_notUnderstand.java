package day10_stringManipulation;

public class c06_lastIndexOf_notUnderstand {
    public static void main(String[] args) {
                    //0123456789012345678901
        String str = "Java bazen beyin yakar";
        System.out.println(str.indexOf("a")); // 1
        System.out.println(str.lastIndexOf("a")); // 20
        System.out.println(str.indexOf("a", 2)); // 3// 2. indexten sonra gördüğü ik a harfinin
                                                                    // cümledeki indexi
        System.out.println(str.lastIndexOf("a", 19)); // 18
                                                                   // once 19. indexe gider onun SOL tarafında yakaladıgı
                                                                   //ilk a'YI BULUR VE ONUN İNDEX DEGERİNİ GOSTERİR
        System.out.println(str.indexOf("a",4)); // 6
        System.out.println(str.lastIndexOf("a", 17)); // 6
        System.out.println(str.indexOf('e')); // 8
        System.out.println(str.lastIndexOf('e')); // 12
        System.out.println(str.lastIndexOf("Mustafa")); // -1
        // Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 1'den fazla kullanilmis
        // 3- aradiginiz kelime cumlede hic kullanilmamis
        String cumle= "Yasasin java, iyi ki java ogreniyorum";
        String kelime= "Yasasin";

        int ilkIndex= cumle.indexOf(kelime);
        int lastIndex= cumle.lastIndexOf(kelime);

        if (ilkIndex != lastIndex){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else if (ilkIndex == lastIndex) {
            System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
        }else{
            System.out.println("aradiginiz kelime cumlede 1'den fazla kullanilmis");
        }


    }
}
