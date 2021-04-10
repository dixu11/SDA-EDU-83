import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        do {
            number = scanner.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        } while (number != 0);
        System.out.println(max + min);
        System.out.println((max + min) / 2.0f);
    }
}