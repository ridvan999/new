package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_ListElementlerininYeriniDegistirme {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(10);
        System.out.println(sayilar);//[3, 5, 1, 4, 3, 7, 10]
        // 2.indexdeki element ile 5.index'deki elementin yerini degistirin
        // once bir tanesini temp variable'a atayalim
        int temp=sayilar.get(5);// temp=7
        sayilar.set(5,1);
        sayilar.set(2,temp);





        System.out.println(sayilar);
    }


}
