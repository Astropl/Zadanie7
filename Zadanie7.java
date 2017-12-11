import java.util.Scanner;

public class Zadanie7
 /*Zadanie 7. Napisać program, który pobiera od użytkownika liczbę
całkowitą dodatnią, a na- stępnie wyświetla na ekranie kolejno
wszystkie liczby niepatrzyste nie większe od podanej liczby.
Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13,
15. */ {
    public static void main(String[] args) {
        System.out.println(" Podaj liczbe całkowita dodatnia :");
        Scanner sc = new Scanner(System.in);
        int liczba, sprawdzLiczbe = 0;
        liczba = sc.nextInt();
        sprawdzLiczbe = (liczba % 2);
        System.out.println(" Reszta z dzielenia to " + sprawdzLiczbe);
        // musze sprawdzic czy liczba parzysta
        if (sprawdzLiczbe == 0) {
            System.out.println(liczba + " to liczba parzyts");
        } else {
            System.out.println(liczba + " to nie parzysta liczba ");
        }
        for (int i = 1; i < liczba; i++) {
            // sprawdzLiczbe = sprawdzLiczbe;
            sprawdzLiczbe = (i % 2);
            if (sprawdzLiczbe == 0) {
                //System.out.println(" Liczba nie parzysta to :" + i);
            } else {
                System.out.println(" Liczba nie parzysta to :" + i);
            }
        }
    }
}
