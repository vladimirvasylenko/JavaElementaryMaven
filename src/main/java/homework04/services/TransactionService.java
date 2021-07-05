package homework04.services;


import homework04.entities.Client;
import homework04.utils.HelperClass;

public class TransactionService {
    public void moneySend(Client client, String accountId) {
        HelperClass helperClass = new HelperClass();
        helperClass.transactionUserChecker(client.getAccountId(), accountId);
    }
}
