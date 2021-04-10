import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = Arrays
                .stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

        Counter licznik = new Counter(numbers);
        licznik.countAllNumbers();
       // int[] inneLiczby = {1, 2, 3};


        //Counter licznik2 = new Counter(inneLiczby);


//        System.out.println("3 - " + licznik.countOccurrences(3));
//        System.out.println("4 - " + licznik.countOccurrences(4));
//        System.out.println("5 - " + licznik.countOccurrences(5));
//        System.out.println("6 - " + licznik.countOccurrences(6));
    }

}

class Counter{

    private int[] numbers;

    public Counter(int[] someNumbers){
        numbers = someNumbers;
    }

    void countAllNumbers() { // liczy ile razy wystepuje kazda liczba od 1 do 10
        for(int i = 1; i<=10; i++){ // i ma 1 do 10
         int count =  countOccurrences(i);
            System.out.println(i + " - " + count);
        }
    }

   private int countOccurrences(int target){ // policz wystąpienia danej liczby
       int occurrences = 0;
        for(int number : numbers){
            if (number == target) {
                occurrences++;
            }
        }
        return occurrences;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
