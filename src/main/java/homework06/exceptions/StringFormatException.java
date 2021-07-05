package homework06.exceptions;

public class StringFormatException extends Exception{
    public StringFormatException(){
        super("This string has some empty symbols");
    }
}
