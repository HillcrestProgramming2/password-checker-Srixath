package java.org.hillcrest.chapter6.password;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.java.org.hillcrest.chapter6.FeedbackGenerator;
import org.junit.jupiter.api.Test;

public class FeedbackGeneratorTest {

    @Test
    public void testGenerateFeedback() {
        String password = "iam@123H";

        String feedback = FeedbackGenerator.generateFeedback(password);

        assertEquals("Password is valid", feedback);
    }
}
