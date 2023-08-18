package day40_maps;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C01_Update {
    public static void main(String[] args) {
        // verilen map'de sube ismi M olanlarin // subesini N yapin
        Map<Integer, String> okulMap = MapMethodDepo.ornekMapOlustur();
            System.out.println(okulMap);
            // {101-Ali-Cem-10-H-MF,
            // 102-Veli-Can-10-M-TM,
            // 103-Ali-Can-11-M-Soz,
            // 104-Ayse-Cem-11-H-TM,
            // 105-Ayse-Han-10-H-MF,
            // 106-Veli-Han-10-H-MF}
        System.out.println(okulMap.get(101));// Ali-Cem-10-H-MF
        System.out.println(okulMap.put(101, "Ali-Cem-10-M-MF"));
        System.out.println(okulMap);


            // 1- once key 'leri bir set olarak kaydedelim
            // 2- her bir key e ait value'yu parçalara ayıralım yani spilit ile arraye dönüştürelim
            // 3- sube bilgisi eski olanları yeni şube yapalım
            // 4- array deki bilgileri birleştirerek yeniden map e ekleyelim
            // 5- okulMap inin son halini return edelim

            // 6- return edilen yeni halini eski map e assign edelim
        okulMap=MapMethodDepo.topluSubeDegistirme(okulMap, "M","N");
    }
}
