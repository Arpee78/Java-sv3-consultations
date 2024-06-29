package week04.day2;

public class NameValidator {

    public boolean isValidName(String name) {

        String[] nameParts = name.strip().replaceAll(" +", " ").split(" ");

        if (hasMoreThanTwoParts(nameParts)) {
            return false;
        }

        if (isFirstCharUppercase(nameParts)) {
            return false;
        }

        return true;
    }

    private static boolean hasMoreThanTwoParts(String[] nameParts) {
        if (nameParts.length < 2) {
            return true;
        }
        return false;
    }

    private static boolean isFirstCharUppercase(String[] nameParts) {
        for (String namePart : nameParts) {
            if (!Character.isUpperCase(namePart.charAt(0))) {
                return true;
            }
        }
        return false;
    }
}
