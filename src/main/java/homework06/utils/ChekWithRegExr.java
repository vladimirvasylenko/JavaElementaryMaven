package homework06.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChekWithRegExr {

    public void chekPhoneNumber(String string) {
        Pattern pattern = Pattern.compile("^\\+?38\\(?0\\d{2}\\)\\d{3}-\\d{2}-\\d{2}$");
        Matcher matches = pattern.matcher(string);

        if (matches.find()) {
            System.out.println(string.substring(matches.start(), matches.end()));
        } else {
            System.out.println("Incorrect phone number");
        }
    }

    public void chekEmail(String string) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9][A-Za-z0-9\\.\\-_]*[A-Za-z0-9]*@([A-Za-z0-9]+([A-Za-z0-9-]*[A-Za-z0-9]+)*\\.)+[A-Za-z]*$");
        Matcher matches = pattern.matcher(string);

        if (matches.find()) {
            System.out.println(string.substring(matches.start(), matches.end()));
        } else {
            System.out.println("Incorrect email");
        }
    }

    public void chekDateOfBirth(String string) {
        Pattern pattern = Pattern.compile("^(?:0[1-9]|[12]\\d|3[01])([\\/.-])(?:0[1-9]|1[012])\\1(?:19|20)\\d\\d$");
        Matcher matches = pattern.matcher(string);

        if (matches.find()) {
            System.out.println(string.substring(matches.start(), matches.end()));
        } else {
            System.out.println("Incorrect Date of Birth");
        }
    }
}
