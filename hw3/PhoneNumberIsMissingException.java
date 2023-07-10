package hw3;


public class PhoneNumberIsMissingException extends Exception {
    public PhoneNumberIsMissingException() {
        super("Номер телефона не найден");
    }
}