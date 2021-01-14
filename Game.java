package pl.sda.zdjavapol75.praca_domowa14_1;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static int randomNumber;
    private static int count = 0;
    private static void randomizer() {
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
    }
    private static void randomizer(int min, int max) {
        Random random = new Random();
        randomNumber = random.nextInt(max-min+1) + min;
    }

    private static void decision() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Czy chcesz podać przedział? Y/N");
        if (scan.nextLine().equals("Y")) {
            System.out.println("Podaj pierwszą liczbę:");
            int min = scan.nextInt();
            System.out.println("Podaj drugą liczbę:");
            int max = scan.nextInt();
            randomizer(min, max);
        } else {
            randomizer();
        }
    }

    public static void game() {
        decision();
        int number = askForNumber();
        while (!isWin(number)){
            count++;
            if (count > 5) {
                break;
            }
            isBigger(number);

            number=askForNumber();
        }
        System.out.println(count == 5 ? "Przegrałeś" : "Brawo, wygrałeś za " + count + " razem");
    }

        private static void isBigger(int userNumber) {
            System.out.println(userNumber > randomNumber ? "Twoja wylosowana liczba jest mniejsza" : "Wylosowana liczba jest większa");
        }

    private static boolean isWin(int userNumber) {
        return userNumber == randomNumber;
    }

    private static int askForNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        return scan.nextInt();
    }

}
