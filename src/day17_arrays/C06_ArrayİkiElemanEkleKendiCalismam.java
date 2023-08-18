package day17_arrays;

import java.util.Arrays;

public class C06_ArrayİkiElemanEkleKendiCalismam {
    public static void main(String[] args) {
        // verilen bir array'e istenen 2 tane elementi ekleyip,
        // yeni halini bize donduren bir method olusturun
        int[] arr = {2,4,7,8};
        // arr'ye method'u kullanarak 5 ekleyin
        arr=arrayeElementEkle(arr,5,3);
        arr=arrayeElementEkle(arr,3,7);
        arr=arrayeElementEkle(arr,19,6);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] arrayeElementEkle(int[] arr , int eklenecekElement, int eklenecekDigerEleman){
        int[] yeniArr= new int[arr.length+2]; // [0,0,0,0,0,0]
        for (int i = 0; i < arr.length ; i++) {
            yeniArr[i]=arr[i];
        } // yeniArr [2,4,7,8,0]
        yeniArr[yeniArr.length-2] = eklenecekElement;
        yeniArr[yeniArr.length-1] = eklenecekDigerEleman;

        return yeniArr;
    }
}
