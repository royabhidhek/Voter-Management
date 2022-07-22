package com.clickmaithil.voter.management.common;

import java.io.Serializable;

public class GenericResponse {

    String message;
    Integer status;
    Object payload;

    public GenericResponse(String message, int status, Object payload) {
        this.message = message;
        this.status = status;
        this.payload = payload;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }




}
