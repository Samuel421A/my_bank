package Exceptions;

public class DeniedWithdrawalException extends RuntimeException {
    public DeniedWithdrawalException(String message) {
        super(message);
    }
}
