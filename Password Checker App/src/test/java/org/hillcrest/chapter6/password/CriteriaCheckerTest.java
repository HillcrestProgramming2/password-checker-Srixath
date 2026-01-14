package java.org.hillcrest.chapter6.password;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.java.org.hillcrest.chapter6.CriteriaChecker;
import org.junit.Test;
import org.junit.jupiter.api.Test;

public class CriteriaCheckerTest {

    @Test
    public void testEvaluateCriteria() {
        String password = "iam@123H";

        int result = CriteriaChecker.evaluateCriteria(password);

        assertEquals(5, result);
    }
}
