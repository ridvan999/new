package day04_dataCasting_wrapperClasses;

public class c03dataCasting {
    public static void main(String[] args) {
        int a= 20;
        int b= 6;
        System.out.println(a/b);
        double c= 6;

        System.out.println(a/c);
        //** bölünen datalarda hangi data türü genişse ona göre yanıt verir
        float d= 8f; //float  datasında değerin yanına f konmalıdır. double ile karışmasın diye

        System.out.println((double)a/b);// işlem önceliği doubleden başlar sonucu 3.333333333333335 oldu
        System.out.println((double)(a/b)); //a/b parantez içinde ve data türü int olduğu için 3 verdi.
                                           //sonucu double cinsinden açıkladığı için de 3.0 oldu
        System.out.println(a/(double)  b); //


    }
}
