package com.queomedia.commons.exceptions;


/**
 * This Exception indicates that some thing can not been created,
 * because it already exists.
 * @see AlreadyExistsException
 */
public class AlreadyExistsRuntimeException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7971523134580730616L;

    /**
     * Instantiates a new already exists exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public AlreadyExistsRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new already exists exception.
     *
     * @param message the message
     */
    public AlreadyExistsRuntimeException(String message) {
        super(message);
    }

    /**
     * Instantiates a new already exists exception.
     *
     * @param cause the cause
     */
    public AlreadyExistsRuntimeException(Throwable cause) {
        super(cause);
    }

}
