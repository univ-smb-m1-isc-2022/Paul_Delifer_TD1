package PROJECT;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MailValidatorTest {
    @Test
    public static void testMail(){
        Assertions.assertTrue(MailValidator.validate("test@mail.com"));
        Assertions.assertFalse(MailValidator.validate("test"));
        Assertions.assertFalse(MailValidator.validate("test@"));
        Assertions.assertFalse(MailValidator.validate("test@mail"));
        Assertions.assertFalse(MailValidator.validate("test@mail."));
        Assertions.assertFalse(MailValidator.validate(""));

    }
}
