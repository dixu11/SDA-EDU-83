import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        System.out.println( roundFloor(number));
        System.out.println( round(number));
        System.out.println( roundUp(number));
    }

   static int roundFloor(double value) {
        return (int) value;
    }

    static int round(double value) {
        return (int)Math.round(value);
    }

    static int roundUp(double value){
        return (int) Math.ceil(value);
    }

  /*  static int roundFloor1(double value) {
        return (int) value;
    }


    static int roundUp1(double value){
        return  roundFloor1(value) + 1;
    }*/


}