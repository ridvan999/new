package day29_inheritance;

public class D11 extends D10 {
    int telNo=2323;

    public static void main(String[] args) {

        D11 obj= new D11();
        System.out.println(obj.telNo);
        D10 obj2 =new D11();
        System.out.println(obj2.telNo);
        System.out.println(D10.getHastaneIsmi());


    }


}
