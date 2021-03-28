import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Napisz program, który odczytuje wprowadzony przez użytkownika tekst, a nastepnie dzieli go na poszczególne słowa. Następnie zlicza ilość wystąpień słów niezależnie od wielkości liter i wypisuje je w konsoli w kolejności alfabetycznej.

//       Przykładowo dla tekstu "Ala lubi koty, ale nie jest przez Koty lubiana.", program powinien wypisać w konsoli:

//        ala - 1
//        ale - 1
//        jest - 1
//        koty - 2
//        lubi - 1
//        lubiana - 1
//        nie - 1
//        przez - 1
//        Załóż, że w tekscie moga pojawić się dowolne znaki interpunkcyjne.

//        Dane pobierz od użytkownika w konsoli za pomocą klasy Scanner.



        String zdanie = scanner.nextLine();

        String[] slowa = zdanie.split(" ");
       // System.out.println(Arrays.toString(slowa));
        for (int i = 0; i < slowa.length; i++) {
            String slowo = slowa[i];
            slowa[i] = poprawSlowo(slowo);
        }
        posortujAlfabetycznie(slowa); // moje rozwiazanie - bouble sort
        // Arrays.sort(slowa);  // javowe rozwiazanie - quick sort
       // System.out.println(Arrays.toString(slowa));

        // 9,4,5,1

        String litera1 = "m";
        String litera2 = "b";
       // System.out.println(litera1.compareTo(litera2));
        // -   ----------- 0 --------------> +
        policzWystapienia(slowa);

    } // koniec main

    public static String poprawSlowo(String slowo) {
        //System.out.println("Przed modyfiacją: " + slowo);
       /* if (slowo.endsWith(",") || slowo.endsWith(".") ||slowo.endsWith("!")|| slowo.endsWith("?")) { //czy kończy się na przecinek lub kropkę
            slowo = slowo.substring(0, slowo.length() - 1); // ucinam ostatni znak
       }*/
        slowo = slowo.replace(",","")
                .replace(".","")
                .replace("!","")
                .replace("?","");
        slowo = slowo.toLowerCase();
        //System.out.println("Po modyfikacji: " + slowo);
        return slowo;
    }

    public static void posortujAlfabetycznie(String[] slowa) {
        for (int i = 0; i < slowa.length; i++) {
            for (int j = 0; j < slowa.length - 1 - i; j++) { // - i  dla wydajności, -1 zeby nie wychodzic poza zakres
                if (slowa[j].compareTo(slowa[j + 1]) > 0) { // + oznacza "przesuń w prawo"
                    String temp = slowa[j]; //zapamietuje to co po lewej
                    slowa[j] = slowa[j + 1]; // na miejscu lewej trafia z prawej
                    slowa[j + 1] = temp; // na miejscu prawej odczytuje co bylo na lewej
                }
            }
        }
    }

    public static void policzWystapienia(String[] slowa) {
        int powtorki = 1;
        for (int i = 1; i < slowa.length; i++) {
            String wczesniejsze = slowa[i - 1];
            String aktualne = slowa[i];
            if (wczesniejsze.equals(aktualne)) {
                powtorki++;
            } else {
                System.out.println(wczesniejsze + " - " + powtorki);
                powtorki = 1;
            }
            if(i == slowa.length-1){ // jeśli jestem przy ostatnim to podsumowuje ten ostatni
                System.out.println(aktualne + " - " + powtorki);
            }
        }
    }


}