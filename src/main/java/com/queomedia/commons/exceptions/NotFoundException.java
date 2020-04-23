/**
 * 
 */
package com.queomedia.commons.exceptions;

/**
 * Thrown to indicate that an element is not found.
 *
 *
 */
public class NotFoundException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7102573092675666623L;

    /**
     * Instantiates a new not found exception.
     */
    public NotFoundException() {
    }

    /**
     * Instantiates a new not found exception.
     * 
     * @param message the message
     */
    public NotFoundException(final String message) {
        super(message);
    }

    /**
     * Instantiates a new not found exception.
     * 
     * @param cause the cause
     */
    public NotFoundException(final Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new not found exception.
     * 
     * @param message the message
     * @param cause the cause
     */
    public NotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
