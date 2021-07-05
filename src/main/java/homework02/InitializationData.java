package homework02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class InitializationData {

    public Information initializationData() {

        Information information = new Information();

        for (int i = 0; i < 30; i++) {

            String name = "name" + i;
            information.getNameList().add(name);

            String mail = "mail" + i + "@gmail.com";
            information.getMailSet().add(mail);

            information.getInformationMap().put(mail, name);
        }

        for (int i = 0; i < 10; i++) {

            String testName = "testName";
            information.getNameList().add(testName);

            String testMail = testName + "@testMail";
            information.getMailSet().add(testMail);

            information.getInformationMap().put(testMail, testName);
        }

        if (deduplicate(information)) {
            System.out.println("the size of collection is same");
            return information;
        }
        System.out.println("the size of collection isn't same");
        return information;
    }

    private boolean deduplicate(Information information) {

        if (information.getNameList().size() != information.getMailSet().size()) {

            List<String> deduplicateNameList = new ArrayList<>(new HashSet<>(information.getNameList()));
            information.getNameList().removeAll(information.getNameList());
            information.getNameList().addAll(deduplicateNameList);

            return true;
        } else
            return false;
    }

}
