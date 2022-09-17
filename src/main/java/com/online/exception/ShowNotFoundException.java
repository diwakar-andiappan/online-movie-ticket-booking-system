package com.online.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ShowNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ShowNotFoundException(){
        super();
    }

    public ShowNotFoundException(String message){
        super(message);
    }

}
