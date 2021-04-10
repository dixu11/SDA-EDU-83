import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //1,2,3,5,7 - > przykład liczb pierwszych do 10

        if (number <= 1) {
            System.out.println("Przerywam pracę");
            return;
        }

        if (isPrime(number)) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }


    }

    static boolean isPrime(int value){ // dostaje liczbę i zwraca true jeśli liczba pierwsza false jeśli nie
        for (int i = 2; i < value; i++) {
            if (value % i == 0 ) {
                return false;
            }
        }
        return true;
    }


}