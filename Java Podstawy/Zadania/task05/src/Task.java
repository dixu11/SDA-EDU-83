import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            if(i %2 == 1){
                System.out.println(i);
            }

        }
    }
}