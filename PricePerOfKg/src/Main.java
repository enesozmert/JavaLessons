import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double applePerKg;
        double pearPerKg;
        double tomatoPerKg;
        double bananaPerKg;
        double auberginePerKg;
        double total = 0.00;
        double read = 0.00;

        pearPerKg = 2.14;
        applePerKg = 3.67;
        tomatoPerKg = 1.11;
        bananaPerKg = 0.95;
        auberginePerKg = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.println("Elma kg : ");
        read = input.nextDouble();
        total += (applePerKg * read);

        System.out.println("Armut kg : ");
        read = input.nextDouble();
        total += (pearPerKg * read);

        System.out.println("Domates kg : ");
        read = input.nextDouble();
        total += (tomatoPerKg * read);

        System.out.println("Muz kg : ");
        read = input.nextDouble();
        total += (bananaPerKg * read);

        System.out.println("Patlıcan kg : ");
        read = input.nextDouble();
        total += (auberginePerKg * read);

        System.out.println("Toplam Tutar :" + total);
    }
}
