package homework02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Information addMoreData(List<Number> primitiveList, Information information) {

        for (int i = 0; i < primitiveList.size(); i++) {
            String name = primitiveList.get(i).toString();
            String mail = name + "@gmail.com";

            if (information.getInformationMap().containsKey(mail)) {
                System.out.println("Information already has this data");
            } else {
                information.getNameList().add(name);
                information.getMailSet().add(mail);
                information.getInformationMap().put(mail, name);
            }
        }
        return information;
    }

    public static void main(String[] args) {

        InitializationData initializationData = new InitializationData();

        List<Number> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2.2);
        myList.add(3.5d);
        myList.add(3.5d);

        Information information = addMoreData(myList, initializationData.initializationData());
        System.out.println(information);
    }
}
