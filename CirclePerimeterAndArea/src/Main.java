import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double r;
        double area;
        double perimeter;
        double pi;

        pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Daire için Yarı çap giriniz : ");
        r = input.nextInt();

        area = pi * r * r;
        perimeter = 2 * pi * r;

        System.out.println("Daire için çevre : " + perimeter);
        System.out.println("Daire için alan : "+ area);
    }
}
