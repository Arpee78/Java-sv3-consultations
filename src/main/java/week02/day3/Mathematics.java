package week02.day3;

import java.math.BigInteger;

public class Mathematics {

//    Készíts egy w02d03.Mathematics osztályt,
//    melyben van egy boolean isPrime(int number) metódus ami igaz értéket ad vissza,
//    ha a paraméterül kapott szám prím, különben hamisat.
//    Commitold és töltsd fel a megoldásodat a megfelelő módon
//    (ex-w02d03 kezdetű üzenettel)!

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.isPrime(2_147_483_647));
    }
}
