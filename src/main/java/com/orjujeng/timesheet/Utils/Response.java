package com.orjujeng.timesheet.Utils;

import java.io.Serializable;

public class Response<T> implements Serializable {
    private T data;
    private String code;
    public Response(T data) {
        this.data = data;
    }

    public static <T> Response<T> success(T data){
        return new Response<T>(data);
    }

    public static <T> Response<T> error(T data){
        return new Response<T>(data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
