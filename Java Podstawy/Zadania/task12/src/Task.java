import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = Arrays
                .stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

        // Tu zaimplementuj rozwiązanie

      /*  Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int powtorki = 1;
        for (int i = 1; i < numbers.length; i++) {
            int wczesniejsze = numbers[i - 1];
            int aktualne = numbers[i];
            if (wczesniejsze == aktualne) {
                powtorki++;
            } else {
                System.out.println(wczesniejsze + " - " + powtorki);
                powtorki = 1;
            }
            if (i == numbers.length - 1) {
                System.out.println(aktualne + " - " + powtorki);
            }
        }*/
    }
}
