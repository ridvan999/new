package day30_inheritance;

public class CToyotaCorolla extends BToyota{
    String lastik="Lassa 205-55-15";
    String model="Corolla";
    String yakit="Corolla dizel,benzinli ve elektrikli olabilir";
    String renk="Mavi";
   public void motor(){
    System.out.println("Corolla araclar turkiye'de uretilen motor kullanir");
  }
    public void uretimYeri() {
        System.out.println("Corolla araclar Turkiye'de uretilir");
    }
    public static void main(String[] args) {


        BToyota corolla=new CToyotaCorolla();
        System.out.println(corolla.lastik); //Toyota-- Bridgestone
        System.out.println(corolla.model); //Araba -- Tum arabalarin modeli olur
        System.out.println(corolla.yakit); //Araba -- Tum arabalar yakitla calisir
        //System.out.println(corolla.renk);// CTE
        corolla.motor();//Corolla -- Corolla araclar turkiye'de uretilen motor kullanır
        corolla.uretimYeri(); //Corolla araclar Turkiye'de uretilir
        System.out.println(corolla.marka);//Toyota -- Toyota
        System.out.println(corolla.aku); //Toyota -- Inci aku
        corolla.guvenlik(); // Toyota -- Toyota araclar extra guvenli
        System.out.println(corolla.vites); //Araba -- Tum arabalarin vitesi olur



        /* Anladıklarım
        1- obje olusturdugumuzda önce data türü hangi classı vermişse
        (yani sol tarafa) oraya gideriz
             ---yazdırmak istediğimiz variable ise
             önce o classta var mı ona bakarız.varsa yazdırır
             yoksa parent classa gideriz parent classta varsa onu yazdırırız
             ama alt classta o variable varsa bile gidemeyiz.
             ---yazdırmak istediğimiz method ise
             önce classta var mı ona bakarız.
             varsa hemen onu yazdırmayız
             daha günceli child  classta var mı ona bakarız (override)
             yoksa kendi classındakini yazdırırız.
             eğer kendi classında  ve ve child classında yok ama parent classında
             varsa parent classındaki methodun çıktısını yazdırırız
             --- yani variablellar daha güncelini aramaz ancak parent classından arayabilirken
                methodlar kendi classında veya parent classında varsa classlarda gezinir ve
                override sayesinde en güncelini bulmaya çalışır.
                */

    }

}
 /*CToyotaCorolla corolla=new CToyotaCorolla();
        System.out.println(corolla.lastik); //Corolla --  Lassa 205-55-15
        System.out.println(corolla.model); // Corolla --  Corolla
        System.out.println(corolla.yakit); // Corolla --  Corolla dizel,benzinli ve elektrikli olabilir
        corolla.motor();// Corolla -- "Corolla araclar turkiye'de uretilen motor kullanir"
        corolla.uretimYeri(); // Corolla -- Corolla araclar Turkiye'de uretilir
        System.out.println(corolla.marka);// Toyota --  Toyota
        System.out.println(corolla.aku); // Toyota --  İnci akü
        corolla.guvenlik(); // Toyota  -- Toyota araclar extra guvenlik onlemleri barindiri
        System.out.println(corolla.vites); // Araba --
        BToyota cor=new CToyotaCorolla();
        */
