package day17_arrays;

import java.util.Arrays;

public class C04_SagaKaydirma {
    public static void main(String[] args) {
        // Verilen int bir array'deki tum elementleri bir saga kaydirip
        // sondaki elementi de en basa alip kaydedin
        // orn : [3,4,5,6]  ==> son hali : [6,3,4,5]
        int[] arr= {3,4,5,6};
        int temp= arr[arr.length-1];// tempe arrnin son indeksini atadık.Döngü bitince kullanılacak
        for (int i = 0; i < arr.length-1 ; i++) {
            arr [arr.length-1-i]=arr [arr.length-2-i];//her indekstekini bir sonraki indeksin yerine taşıdık

        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));

    }
}
