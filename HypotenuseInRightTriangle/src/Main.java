import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.println("a giriniz : ");
        a = input.nextInt();

        System.out.println("b giriniz : ");
        b = input.nextInt();

        result = Math.sqrt((a*a) + (b*b));
        System.out.println("Hypotenuse in Right Triangle : " + result);

    }
}
