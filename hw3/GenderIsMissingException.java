package hw3;
public class GenderIsMissingException  extends Exception {
    public GenderIsMissingException() {
        super("Пол не найден");
    }
    
}