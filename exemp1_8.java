import java.util.Scanner;

public class exemp1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int a = scanner.nextInt();
        if (a % 4 != 0) {
            System.out.println("не високосный");
        } else if (a % 100 != 0) {
            System.out.println("Високосный");
        } else if (a % 400 == 0) {
            System.out.println("Високосный");
        } else {
            System.out.println("не високосный");
        }

    }
}
