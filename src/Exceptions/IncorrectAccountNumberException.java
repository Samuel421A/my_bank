package Exceptions;

public class IncorrectAccountNumberException extends RuntimeException {
  public IncorrectAccountNumberException(String message) {
    super(message);
  }
}
