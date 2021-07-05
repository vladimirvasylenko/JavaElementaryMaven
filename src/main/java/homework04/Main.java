package homework04;



import homework04.entities.Client;
import homework04.exeptions.WrongFieldException;
import homework04.exeptions.WrongSumException;
import homework04.services.TransactionService;
import homework04.utils.HelperClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HelperClass helperClass = new HelperClass();
        TransactionService transactionService = new TransactionService();
        Client senderClient = new Client();

        System.out.println("Please - enter sender Account ID: ");
        String senderClientId = scanner.nextLine();

        while (senderClientId.length() != 10) {
            try {
                helperClass.clientIdChecker(senderClientId);

            } catch (WrongFieldException e) {
                System.out.println("Incorrect Account ID");
                System.out.println("Please, write it again");
                senderClientId = scanner.nextLine();
            }
        }
        senderClient.setAccountId(senderClientId);

        System.out.println("Please - enter receiver Account ID: ");
        String receiverClientId = scanner.nextLine();

        while (receiverClientId.length() != 10) {
            try {
                helperClass.clientIdChecker(receiverClientId);

            } catch (WrongFieldException e) {
                System.out.println("Incorrect Account ID");
                System.out.println("Please, write it again");
                receiverClientId = scanner.nextLine();
            }
        }

        System.out.println("Please - enter sum of transaction: ");
        double sum = scanner.nextDouble();

        while (sum > 1000d) {
            try {
                helperClass.sumChecker(sum);
            } catch (WrongSumException e) {
                System.out.println("Incorrect sum");
                System.out.println("Please, write it again");
                sum = scanner.nextDouble();
            }
        }

        scanner.close();
        transactionService.moneySend(senderClient, receiverClientId);
        System.out.println("Money already sent");

    }
}
