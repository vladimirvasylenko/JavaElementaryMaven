package homework06.utils;


import homework06.exceptions.StringFormatException;

public class StringHelper {
    public String arrayToStringWithCheck(String string, char[] charArray) throws StringFormatException {

        if (charArray == null) {
            throw new NullPointerException();
        }

        String charArrayToString = String.valueOf(charArray);

        if (string.isBlank() || charArrayToString.isBlank()) {
            throw new StringFormatException();
        }

        String stringToUpperCase = string.toUpperCase();
        String charStringToLowerCase = charArrayToString.toLowerCase();

        String concatString = stringToUpperCase.concat(" " + charStringToLowerCase);
        String cutCarFromString;

        if (concatString.length() % 2 != 0) {
            cutCarFromString = concatString.substring(0, concatString.length() / 2) + concatString.substring(concatString.length() / 2 + 1);
            return cutCarFromString;

        } else {
            cutCarFromString = concatString.substring(0, concatString.length() / 2 - 1) + concatString.substring(concatString.length() / 2 + 1);

        }
        return cutCarFromString;
    }
}
