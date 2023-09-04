package pl.arcadio.linkshortening.exceptions;

public class InvalidPasswordException extends RuntimeException{
    public InvalidPasswordException(){
        super("wrong password");
    }
}
