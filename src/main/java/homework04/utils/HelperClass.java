package homework04.utils;


import homework04.exeptions.UserExpectedError;
import homework04.exeptions.WrongFieldException;
import homework04.exeptions.WrongSumException;

public class HelperClass {

    public void clientIdChecker(String clientId) throws WrongFieldException {

        if (clientId.length() != 10) {
            throw new WrongFieldException();
        }
    }

    public void sumChecker(Double sum) throws WrongSumException {

        if (sum > 1000d) {
            throw new WrongSumException();
        }
    }

    public void transactionUserChecker(String senderId, String receiverId) {

        if (senderId.equals(receiverId)) {
            throw new UserExpectedError();
        }
    }
}
