package day09_switch_stringManupulations;

public class c07_length {
    public static void main(String[] args) {
        String str = "Java gun gectikce guzellesiyor";
        // bu cumledeki karakter sayisini yazdirin
        System.out.println(str.length()); // 30
        // bu cumledeki son karakteri yazdirin
        System.out.println(str.charAt(str.length()-1));//yani charAt0'ın degeri her zaman Length'in 1 eksigidir.
        // sondan 3.karakteri yazdirin
        System.out.println(str.length() - 3); // 27
        System.out.println(str.charAt(str.length() -3 ));//sondan 3. harf


    }
}
