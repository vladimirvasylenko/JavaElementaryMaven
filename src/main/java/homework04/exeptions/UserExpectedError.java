package homework04.exeptions;

public class UserExpectedError extends RuntimeException {
    public UserExpectedError() {
        super("Sender and receiver account ID is same");
    }
}
