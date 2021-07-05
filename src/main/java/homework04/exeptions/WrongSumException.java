package homework04.exeptions;

public class WrongSumException extends Exception {
    public WrongSumException() {
        super("The client sum more, than 1000");
    }
}
