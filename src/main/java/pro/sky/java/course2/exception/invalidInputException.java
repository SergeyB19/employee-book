package pro.sky.java.course2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class invalidInputException extends RuntimeException {
    public invalidInputException() {
    }

    public invalidInputException(String message) {
        super(message);
    }

    public invalidInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public invalidInputException(Throwable cause) {
        super(cause);
    }

    public invalidInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
