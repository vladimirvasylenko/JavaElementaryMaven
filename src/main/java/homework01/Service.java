package homework01;

import java.io.IOException;

public interface Service {

    boolean checkUser(Master user) throws IOException;

    void writeUser(Master user) throws IOException;
}
