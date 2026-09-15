package Exceptions;

public class IncorrectAgencyNumberException extends RuntimeException {
  public IncorrectAgencyNumberException(String message) {
    super(message);
  }
}
