package main.java.org.hillcrest.chapter6;

public class CriteriaChecker {

    private static boolean meetLength;
    private static boolean hasUpperCase;
    private static boolean hasLowerCase;
    private static boolean hasDigit;
    private static boolean hasSpecialChar;

    public static int evaluateCriteria(String password) {
        int criteriaCounter = 0;

        meetLength = false;
        hasUpperCase = false;
        hasLowerCase = false;
        hasDigit = false;
        hasSpecialChar = false;

        String validSpecialChar = "!@#$%^&*()-+=";

        if (password.length() >= 8) {
            meetLength = true;
            criteriaCounter++;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
            else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            else if (validSpecialChar.indexOf(ch) != -1) {
                hasSpecialChar = true;
            }
        }

        if (hasUpperCase) criteriaCounter++;
        if (hasLowerCase) criteriaCounter++;
        if (hasDigit) criteriaCounter++;
        if (hasSpecialChar) criteriaCounter++;

        return criteriaCounter;
    }

    public static String determineStrength(int score) {
        return switch (score) {
            case 0, 1, 2 -> "Weak";
            case 3 -> "Moderate";
            case 4, 5 -> "Strong";
            default -> "Invalid score";
        };
    }

    public static boolean isMeetLength() {
        return meetLength;
    }

    public static boolean isHasUpperCase() {
        return hasUpperCase;
    }

    public static boolean isHasLowerCase() {
        return hasLowerCase;
    }

    public static boolean isHasDigit() {
        return hasDigit;
    }

    public static boolean isHasSpecialChar() {
        return hasSpecialChar;
    }
}
