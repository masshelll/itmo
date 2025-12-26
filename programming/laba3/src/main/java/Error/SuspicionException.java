package Error;

public class SuspicionException extends RuntimeException {
    public SuspicionException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return " " + super.getMessage();
    }
}
