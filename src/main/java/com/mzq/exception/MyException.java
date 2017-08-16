package com.mzq.exception;


public class MyException extends Exception{
    private static final long serialVersionUID = 1202433976732384458L;
    //异常信息
    private String message;
    
    public MyException(String message){
        super(message);
        this.message = message;
        
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
