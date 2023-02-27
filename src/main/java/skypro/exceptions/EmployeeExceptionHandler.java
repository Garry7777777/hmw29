package skypro.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class EmployeeExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<MessageForExceptions>
    handleException(EmployeeException EmployeeException) {

        MessageForExceptions message = new MessageForExceptions();
        message.setMessage(EmployeeException.getMessage());
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }

}