package exceptions;

public class BoardMismatchedSizeException extends RuntimeException{
    public BoardMismatchedSizeException(String message) {
        super(message);
    }
}
