package PROJECT;

import org.apache.commons.validator.routines.EmailValidator;

public class MailValidator {
    public static boolean validate(String email) {

        return EmailValidator.getInstance().isValid(email);

        /*
        return email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$");*/
    }
}
