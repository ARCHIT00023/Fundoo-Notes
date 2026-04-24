package com.example.Fundoo_Notes.exception;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

 @ExceptionHandler(UserNotFoundException.class)
 public ResponseEntity<String> handleException(UserNotFoundException ex){
     return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
 }

}