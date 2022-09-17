package com.online.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class TheatreNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public TheatreNotFoundException(){
        super();
    }

    public TheatreNotFoundException(String message){
        super(message);
    }
}
