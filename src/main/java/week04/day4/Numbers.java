package week04.day4;

public class Numbers {

    public int sumOfDigitsMathStyle(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }

        return sum;
    }

    public int sumOfDigitsProgrammerStyle(int number) {
        int sum = 0;

        for (char c : String.valueOf(number).toCharArray()) {
            sum += Character.getNumericValue(c);
        }

        return sum;
    }

    public int sumOfDigitsProgrammer2Style(int number) {
        int sum = 0;

        for (String s : String.valueOf(number).split("")) {
            sum += Integer.parseInt(s);
        }

        return sum;
    }

}
