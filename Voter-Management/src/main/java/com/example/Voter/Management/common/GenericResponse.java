package com.example.Voter.Management.common;

public class GenericResponse {

    String message;
    int status;
    Object payload;
    public GenericResponse(String message, int status, Object payload) {
        this.message = message;
        this.status = status;
        this.payload = payload;
    }


}
