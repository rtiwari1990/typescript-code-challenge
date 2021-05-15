package com.exception;

import java.io.IOException;

public class TypescriptCodeChallengeIOException extends IOException {
    public TypescriptCodeChallengeIOException(String className, String message)
    {
        super(className + ": " +message);
    }
}
