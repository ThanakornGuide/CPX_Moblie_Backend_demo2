package CPX.Mobile.Backend.demo2.exception;



import java.util.HashMap;
import java.util.Map;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.core.Ordered;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class apiValidationHandler  {

    // @Override
    // protected ResponseEntity<Object> handleMethodArgumentNotValid(
    //     MethodArgumentNotValidException ex,HttpHeaders headers,HttpStatus status,WebRequest request){

    //     Map<String, String> errors = new HashMap<>();

    //     ex.getBindingResult().getAllErrors().forEach((error) -> {

    //         String fieldName = ((FieldError) error).getField();
    //         String message = error.getDefaultMessage();
    //         errors.put(fieldName,message);
            
    //     });

    //     return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);

    // }
    
}