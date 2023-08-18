package day30_inheritance;

public class Araba {
    // marka gozetmeksizin tum arabalarin sahip olacagi ozellikleri
    // bu class'a koyariz
    String marka = "Tum arabalarin markasi olur";
    String model = "Tum arabalarin modeli olur";
    String vites = "Tum arabalarin vitesi olur";
    String yakit = "Tum arabalar yakitla calisir";

    public void uretimYeri() {
        System.out.println("Tum arabalar fabrikada uretilir");
    }


   public void motor() {
       System.out.println("Tum arabalarin motoru olur");
    }


}
   /* public static void main(String[] args) {
        Araba corolla=new CToyotaCorolla();
        System.out.println(corolla.lastik); //Toyota-- Bridgestone
        System.out.println(corolla.model); //Araba -- Tum arabalarin modeli olur
        System.out.println(corolla.yakit); //Araba -- Tum arabalar yakitla calisir
        //System.out.println(corolla.renk);// CTE
        corolla.motor();//Corolla -- Corolla araclar turkiye'de uretilen motor kullanır
        corolla.uretimYeri(); //Corolla araclar Turkiye'de uretilir
        System.out.println(corolla.marka);//Toyota -- Toyota
        System.out.println(corolla.aku); //Toyota -- Inci aku
        corolla.guvenlik(); // Toyota -- Toyota araclar extra guvenli
        System.out.println(corolla.vites); //Araba -- Tum arabalar
        */




