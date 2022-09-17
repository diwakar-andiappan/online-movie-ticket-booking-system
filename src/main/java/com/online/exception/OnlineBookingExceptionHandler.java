package com.online.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class OnlineBookingExceptionHandler {

    @ResponseBody
    @ExceptionHandler(MovieNotFoundException.class)
    public ResponseEntity handleMovieNotFoundException(){
        return new ResponseEntity("Movie Not Found", HttpStatus.NOT_FOUND);
    }

    @ResponseBody
    @ExceptionHandler(TheatreNotFoundException.class)
    public ResponseEntity handleTheatreNotFoundException(Exception exception){
        return new ResponseEntity("Theatre not found" + exception, HttpStatus.NOT_FOUND);
    }
}