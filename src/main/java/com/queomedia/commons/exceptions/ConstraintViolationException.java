/**
 * 
 */
package com.queomedia.commons.exceptions;

/**
 * This exception indicates a constraint violation.
 * 
 *
 */
public class ConstraintViolationException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 9130800013459122002L;

    /**
     * Instantiates a new constraint violation exception.
     */
    public ConstraintViolationException() {
    }

    /**
     * The Constructor.
     * 
     * @param message the message
     */
    public ConstraintViolationException(final String message) {
        super(message);
    }

    /**
     * The Constructor.
     * 
     * @param cause the cause
     */
    public ConstraintViolationException(final Throwable cause) {
        super(cause);
    }

    /**
     * The Constructor.
     * 
     * @param message the message
     * @param cause the cause
     */
    public ConstraintViolationException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
