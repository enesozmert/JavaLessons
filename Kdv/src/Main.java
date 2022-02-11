import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total;
        double kdv;
        Scanner input = new Scanner(System.in);

        kdv = 18;
        System.out.println("Ürün fiyatı giriniz : ");
        total = input.nextInt();

        System.out.println("Kdv'siz ürün tutarı : " + total);

        System.out.println("Kdv oranı : " + kdv / 100);

        System.out.println("Kdv tutarı : " + (kdv*total)/100);

        total = total + (kdv*total)/100;
        System.out.println("Kdv'li ürün tutarı : " + total);
    }
}
