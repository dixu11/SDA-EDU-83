import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //kapusta po 1kg lub 7kg
        //Stefan nosi po 3 torby kapusty
        // oczekujemy konkretnej ilości kapusty

        int expectedCabbageWeight = scanner.nextInt();

        //7kg

        boolean canBuy = false;
        for (int bigBags = 0; bigBags<=6; bigBags++) {
            for (int smallBags = 0; smallBags<=6-bigBags ; smallBags++) { // małych może być max 6 minus tyle ile mamy już dużych
                int weight = howManyKilos(bigBags, smallBags);
                if(weight == expectedCabbageWeight){
                    canBuy = true;
                    break;
                }
                System.out.printf("Small: %d Big: %d Weight: %d\n",smallBags,bigBags,weight);
            }
        }
        System.out.println(canBuy);


    }

    //2  3
    private static int howManyKilos(int bigBags,int smallBags){
        return bigBags *7 + smallBags;
    }
}