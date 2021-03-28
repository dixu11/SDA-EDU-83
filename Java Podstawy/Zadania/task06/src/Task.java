import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        if (a >= b) {
            System.out.println("Robota skończona");
            return;
        }
        int sum = 0;

        for (int i = a; i <= b; i++) {
           sum += i;
        }

        System.out.println(sum);



    }
}