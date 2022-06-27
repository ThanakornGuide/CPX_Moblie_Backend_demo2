package CPX.Mobile.Backend.demo2.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {
    
    // @ResponseStatus(HttpStatus.BAD_REQUEST)
    // @ExceptionHandler(MethodArgumentNotValidException.class)
    // public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException ex) {

    //     Map<String, String> erreMap = new HashMap<>();
    //     ex.getBindingResult().getAllErrors().forEach((error) -> {
    //         erreMap.put(error.getField(), error.getDefaultMessage());
    //     });

    //     return erreMap;
    // }

}
