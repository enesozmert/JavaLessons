import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math,physics,chemistry,history,turkce,music;
        int total;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz : ");
        math = input.nextInt();

        System.out.println("Fizik notunu giriniz : ");
        physics = input.nextInt();

        System.out.println("Kimya notunu giriniz : ");
        chemistry = input.nextInt();

        System.out.println("Tarih notunu giriniz : ");
        history = input.nextInt();

        System.out.println("Türkçe notunu giriniz : ");
        turkce = input.nextInt();

        System.out.println("Müzik notunu giriniz : ");
        music = input.nextInt();

        total = math+physics+chemistry+history+turkce+music;
        result = total / 6;

        System.out.println(result);

    }
}
