import java.sql.SQLException;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {

    public static boolean checkAge(int age) throws InvalidAgeException {
        if (age >= 18)
            return true;
        else {
            InvalidAgeException ex = new InvalidAgeException("YOUR AGE IS NOT VALID.");
            throw ex;
        }
    }

    public static void main(String[] args) {
        try {
            if (checkAge(2)) {
                System.out.println("YOUR AGE IS VALID.");
            }
        }catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
