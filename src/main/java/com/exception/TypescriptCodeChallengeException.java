package com.exception;

public class TypescriptCodeChallengeException extends Exception{
    public TypescriptCodeChallengeException(String className, String message)
    {
        super(className + ": " +message);
    }
}
