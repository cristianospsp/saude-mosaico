package br.com.saudemosaico.exception;

import jakarta.persistence.EntityNotFoundException;
import java.lang.IllegalStateException;

public class CustomExceptionHandler extends Exception {

    public CustomExceptionHandler(String mensagem) {
        super(mensagem);
    }
}