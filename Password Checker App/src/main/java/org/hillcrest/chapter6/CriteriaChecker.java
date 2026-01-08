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
        String validSpecialChar = "!@#$%^&*()-+=";
        boolean hasSpecialChar = false;

        if (password.length() >= 8){
            meetLength = true;
            criteriaCounter += 1;
        }
        for (int i = 1; i <= password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
        }
        for (int i = 1; i <= password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
        }
        if (hasUpperCase) {
            criteriaCounter ++;
        }
        if (hasLowerCase) {
            criteriaCounter ++;
        }
        for (int i = 1; i <= password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        if (hasDigit) {
            criteriaCounter ++;
        }
        for (int i = 1; i <= password.length(); i++) {
            char ch = password.charAt(i);
            for (int j = 1; j <= validSpecialChar.length(); j++) {
                char ch2 = validSpecialChar.charAt(j);
                if (ch == ch2) {
                    hasSpecialChar = true;
                    break;
                }
            }
        }
        if (hasSpecialChar) {
            criteriaCounter ++;
        }

        return criteriaCounter;
    }
    public static String determineStrength(int score) {
        return switch (score) {
            case 0, 1, 2 -> "Weak";
            case 3 -> "Moderate";
            case 4, 5 -> "Strong";
            default -> "invalid score";
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
