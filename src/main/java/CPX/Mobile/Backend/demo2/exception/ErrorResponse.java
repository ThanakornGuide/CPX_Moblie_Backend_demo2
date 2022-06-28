package CPX.Mobile.Backend.demo2.exception;


import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ErrorResponse {

    private HttpStatus status;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd hh:mm:ss")
    private LocalDateTime timeStamp;
    private String message;
}

