package com.queomedia.commons.exceptions;


/**
 * This Exception indicates that some thing can not been created,
 * because it already exists.
 * @see AlreadyExistsRuntimeException
 */
public class AlreadyExistsException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3028850215228406940L;

    /**
     * Instantiates a new already exists exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public AlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new already exists exception.
     *
     * @param message the message
     */
    public AlreadyExistsException(String message) {
        super(message);
    }

    /**
     * Instantiates a new already exists exception.
     *
     * @param cause the cause
     */
    public AlreadyExistsException(Throwable cause) {
        super(cause);
    }

}
