package day37_throw;

public class C02_Throwkeyword {
    public static void main(String[] args) {
        String a = null;
        String b = "";
        try {
            try {
                int c = a.length() + b.length();
            } catch (NullPointerException e) {
                if (b.length() == 0) {
                    throw new RuntimeException();
                }
                System.out.println("Null Point vardır. İşlem yapılamaz");
            }
        }catch (RuntimeException e) {
            System.out.println("Throw Keyword Çalıştı");
        }
    }
}
