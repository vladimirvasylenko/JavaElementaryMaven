package homework01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class ServiceAbstractClass implements Service {

    static String file = "/Users/awsome/IdeaProjects/JavaElementary/src/resourses/Data.txt";

    @Override
    public boolean checkUser(Master user) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String emailLine = user.getMail();
        while ((line = bufferedReader.readLine()) != null) {
            if (line.equals(emailLine)) {
                System.out.println("male is found");
                return true;
            }
        }
        bufferedReader.close();
        fileReader.close();
        System.out.println("male isn't found");
        return false;
    }
}
