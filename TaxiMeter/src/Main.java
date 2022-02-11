import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double perKm;
        double total;
        double startPrice;

        perKm = 2.20;
        startPrice = 10;
        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi KM türünden giriniz : ");
        km = input.nextInt();
        total = (km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;

        System.out.println("Toplam ücret öde : " + total);

    }
}
