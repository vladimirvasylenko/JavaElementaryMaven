package homework01;

public class UserService extends ServiceAbstractClass {

    @Override
    public void writeUser(Master user) {
        System.out.println("can't write with UserService");
    }
}
