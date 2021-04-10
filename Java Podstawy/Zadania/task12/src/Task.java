import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = Arrays
                .stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

       // int[] inneLiczby = {1, 2, 3};

        Counter licznik = new Counter(numbers);
        //Counter licznik2 = new Counter(inneLiczby);

        System.out.println(licznik);
        licznik.countOccurrences(3);
    }

}

class Counter{

    private int[] numbers;


    public Counter(int[] someNumbers){
        numbers = someNumbers;
    }

    int countOccurrences(int number){ // policz wystąpienia danej liczby
        for(int i : numbers){
            System.out.println(i);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
