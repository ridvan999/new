package day30_inheritance;

public class BToyota extends Araba {
    String marka = "Toyota";
    String aku = "Inci aku";
    String lastik = "Bridgestone";
    public void motor(){
    System.out.println("Toyotalar cevreci toyota motorlar kullanir");
    }

    public void guvenlik() {
        System.out.println("Toyota araclar extra guvenlik onlemleri barindirir");
    }


        public static void main(String[] args) {
        Araba corolla=new CToyotaCorolla();
        //System.out.println(corolla.lastik); //Toyota-- Bridgestone
        System.out.println(corolla.model); //Araba -- Tum arabalarin modeli olur
        System.out.println(corolla.yakit); //Araba -- Tum arabalar yakitla calisir
        //System.out.println(corolla.renk);// CTE
        corolla.motor();//Corolla -- Corolla araclar turkiye'de uretilen motor kullanır
        corolla.uretimYeri(); //Corolla araclar Turkiye'de uretilir
        System.out.println(corolla.marka);//Toyota -- Toyota
        //System.out.println(corolla.aku); //Toyota -- Inci aku
        //corolla.guvenlik(); // CTE
        System.out.println(corolla.vites); //Araba -- Tum arabalar*/

    }

}
      /*Araba corolla=new CToyotaCorolla();
        System.out.println(corolla.lastik); //Toyota-- Bridgestone
        System.out.println(corolla.model); //Araba -- Tum arabalarin modeli olur
        System.out.println(corolla.yakit); //Araba -- Tum arabalar yakitla calisir
        //System.out.println(corolla.renk);// CTE
        corolla.motor();//Corolla -- Corolla araclar turkiye'de uretilen motor kullanır
        corolla.uretimYeri(); //Corolla araclar Turkiye'de uretilir
        System.out.println(corolla.marka);//Toyota -- Toyota
        System.out.println(corolla.aku); //Toyota -- Inci aku
        corolla.guvenlik(); // Toyota -- Toyota araclar extra guvenli
        System.out.println(corolla.vites); //Araba -- Tum arabalarin vitesi olur*/