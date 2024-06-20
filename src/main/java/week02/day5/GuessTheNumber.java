package week02.day5;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
//        System.out.println(number);
        System.out.println("Gondoltam egy számra 1 és 100 között, megpróbálod kitalálni?\nHat próbálkozásod van.");
        boolean found = false;
        for (int i = 0; i < 6 && !found; i++) {
            System.out.print(i + 1 + ". próbálkozás: ");
            int tip = scanner.nextInt();
            if (number < tip) {
                System.out.println("Nem nyert, a szám kisebb.");
            } else if (number == tip) {
                System.out.println("Talált, nyertél");
                found = true;
            } else if (number > tip) {
                System.out.println("Nem nyert, a szám nagyobb.");
            }
        }

        if (!found) {
            System.out.println("nincs több próbálkozásod.");
        }
    }

}

