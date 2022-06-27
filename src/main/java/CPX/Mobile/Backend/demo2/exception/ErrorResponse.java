package CPX.Mobile.Backend.demo2.exception;

import java.time.LocalDateTime;

import org.hibernate.hql.internal.ast.exec.BasicExecutor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import CPX.Mobile.Backend.demo2.model.userModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ControllerAdvice
public class ErrorResponse {
    
    // @ExceptionHandler(BaseException.class)
    // public ResponseEntity<userModel> handleBaseException(BaseException e){
    //     ErrorMode error = new ErrorMode();
    // }

    // @Data
    // public static class ErrorMode() {
    //     private HttpStatus status;
    //     private LocalDateTime timeStamp = LocalDateTime.now();
    //     private String message;
    // }



}


