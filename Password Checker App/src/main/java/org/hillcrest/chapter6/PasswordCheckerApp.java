package main.java.org.hillcrest.chapter6;
import java.util.Scanner;
public class PasswordCheckerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password: ");

       String password = input.nextLine();

       int criteria = CriteriaChecker.evaluateCriteria(password);
       String strength = CriteriaChecker.determineStrength(criteria);
       String feedback = FeedbackGenerator.generateFeedback(password);

        System.out.println("Criteria met: " + criteria + "/5");
        System.out.println("Password Strength: " + strength);



    }

}
