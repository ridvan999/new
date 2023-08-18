package day44_maps;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C01_EntrySet {
    public static void main(String[] args) {
        // Istenen siniftaki ogrencilerin no, isim, soyisim, bolumlerini bir liste olarak yazdirin
        /*
        Daha onceki yontemlerimizle yapacak olursak,

        1- Once mep'deki tum key'leri okulMap.keySet() ile elde edip bir Set'e kaydederim
                [101,102,103,104,105,106]
        2- for-each loop ile herbir key'e ait valur'yu aliriz  "Ali-Cem-10-H-MF"
            - value.split() ile value'yu bir array'e cavirip kaydederiz  [Ali,Cem,10,H,MF]
            - bu array'de sinifi kontrol edip, eger istenen sinifa esit ise
              key ve value array'inden istenen bilgileri yazdiririm

        Java key ve value degerleri birlikte kullanilabilsin ve gerekirse
        value update edilebilsin diye Entry interface'ini olusturmustur
      */
        Map<Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);
        /*
        {101=Ali-Cem-10-H-MF,
        102=Veli-Can-10-M-TM,
        103=Ali-Can-11-M-Soz,
        104=Ayse-Cem-11-H-TM,
        105=Ayse-Han-10-H-MF,
        106=Veli-Han-10-H-MF}
         */
        MapMethodDepo.sinifaGoreListeYazdir(okulMap,11);
    }
}
