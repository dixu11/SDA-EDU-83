import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int power = 1;
        // power = power *2;

        while (power<=n){
            System.out.println(power);
            power *= 2;
        }


        // Tu zaimplementuj rozwiązanie
    }
}