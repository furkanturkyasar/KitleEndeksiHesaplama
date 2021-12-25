import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double boy, deger;
        int kilo;
        System.out.print("Lutfen boyunuzu giriniz: ");
        boy = girdi.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz: ");
        kilo = girdi.nextInt();
        deger = kilo/(boy*boy);
        System.out.print("Vucut kitle endeksizini: "+deger);

    }
}
