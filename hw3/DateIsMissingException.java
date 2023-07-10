package hw3;

public class DateIsMissingException extends Exception {
    public DateIsMissingException() {
        super("Дата рождения не найдена");
    }

}