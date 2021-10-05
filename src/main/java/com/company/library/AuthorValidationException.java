package com.company.library;

public class AuthorValidationException extends RuntimeException {
    public AuthorValidationException(String errorMessage) {
        super(errorMessage);
    }
}
