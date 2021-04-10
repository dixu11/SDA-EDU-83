import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int podanaLiczba;
        int suma = 0;
        do {
            podanaLiczba = scanner.nextInt();
            suma = suma + podanaLiczba;
        } while (podanaLiczba != 0);
        System.out.println(suma);
    }
}