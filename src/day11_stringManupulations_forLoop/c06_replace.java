package day11_stringManupulations_forLoop;

public class c06_replace {
    public static void main(String[] args) {
        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //      input1 : “15.30 €” , input2 : “11.40 €”
        //      output : 26.70 €
        String input1= "15.30 €";
        String input2= "11.40 €";
        // input'larda digit olmayan herseyi yok edelim,


        // . kaldı.şimdi digit olmayan her seyi yok edelim
        input1 = input1.replaceAll("\\D","");//1530
        input2 = input2.replaceAll("\\D","");//1140


       //şimdi string oldukları için yine toplayamayız..
       // sonuç ondalıklı bir ifade çıkabileceği için
       // double a parse etmeliyiz
        double inp1 = Double.parseDouble(input1);
        double inp2 = Double.parseDouble(input2);
        double output= (inp1+inp2)/100;

        System.out.println(output  + " €");


    }
}
