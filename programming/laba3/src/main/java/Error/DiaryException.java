package Error;

public class DiaryException extends Exception {
    public DiaryException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return "Ошибка доступа к дневнику " + super.getMessage();
    }
}
