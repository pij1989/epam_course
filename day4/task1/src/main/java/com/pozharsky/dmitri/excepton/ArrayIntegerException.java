package com.pozharsky.dmitri.excepton;

public class ArrayIntegerException extends Exception {
    public ArrayIntegerException() {
        super();
    }

    public ArrayIntegerException(String message) {
        super(message);
    }

    public ArrayIntegerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayIntegerException(Throwable cause) {
        super(cause);
    }
}
