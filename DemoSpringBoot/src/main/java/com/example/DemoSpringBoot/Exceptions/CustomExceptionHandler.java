package com.example.DemoSpringBoot.Exceptions;

// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
// import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{
    // @ExceptionHandler(Exception.class)
    // public final ResponseEntity<Response> handleAllExc(Exception ex){

    // }
}
