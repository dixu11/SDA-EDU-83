import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //przygotowanie obiektu z algorytmem
        PalindromeGenerator generator = new PalindromeGenerator();
        //wywołanie algorytmu i wydruk zwroconej wartości
        System.out.println(generator.reverse(text));


    }
}

class PalindromeGenerator { // algorytm zaimlementowany jako zachowanie obiektu PalindromeGenerator

    String reverse(String sentence){ // metoda zwraca obrocony tekst
        String reversed = ""; // do tej zmiennej budujemy nowy tekst
        for(int i = sentence.length()-1 ;  i>=0;i--){ // przegladamy pozycje liter od tyłu
            char letter = sentence.charAt(i); // pobiramy litere z pozycji i
            reversed += letter; // dodajemy litere do budowanego tekstu
        }
        return reversed; // zwracamy zbudowany tekst
    }

}
