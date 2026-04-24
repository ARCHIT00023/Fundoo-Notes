package com.example.Fundoo_Notes.exception;

public class UserNotFoundException extends RuntimeException{

 public UserNotFoundException(String message){
     super(message);
 }

}