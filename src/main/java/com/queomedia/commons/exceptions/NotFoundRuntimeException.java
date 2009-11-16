package com.queomedia.commons.exceptions;

/**
 * Thrown to indicate that an object is not found.
 * 
 *
 */
public class NotFoundRuntimeException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4125626288727236784L;

    /**
     * Instantiates a new not found exception.
     */
    public NotFoundRuntimeException() {
    }

    /**
     * Instantiates a new not found exception.
     * 
     * @param message the message
     */
    public NotFoundRuntimeException(final String message) {
        super(message);
    }

    /**
     * Instantiates a new not found exception.
     * 
     * @param cause the cause
     */
    public NotFoundRuntimeException(final Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new not found exception.
     * 
     * @param message the message
     * @param cause the cause
     */
    public NotFoundRuntimeException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
