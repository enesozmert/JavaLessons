import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double humanHeight;
        double humanWeight;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen insan olarak boyunuzu metre olarak giriniz (Küsüratlı gir) : ");
        humanHeight = input.nextDouble();

        System.out.println("Lütfen insan olarak kilonuzu giriniz (Küsüratlı gir) : ");
        humanWeight = input.nextDouble();

        result = humanWeight / (humanHeight * humanHeight);

        System.out.printf("Vücud Kitle Indeksiniz (Çok zayıfsın az yee) :" + result);
    }
}
