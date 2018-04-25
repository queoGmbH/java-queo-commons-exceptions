/**
 * 
 */
package com.queomedia.commons.exceptions;

/**
 * This exception indicate that something is not implemented.
 * 
 * <p>
 * This is an substitution for {@code sun.reflect.generics.reflectiveObjects.NotImplementedException}, because
 * this package is an internal sun package and should not been used in Java 9.
 * </p> 
 * 
 *
 */
public class NotImplementedException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5909853700650852231L;

    /**
     * Instantiates a new not implemented case exception
     */
    public NotImplementedException() {
        super();
    }

    /**
     * The Constructor.
     * 
     * @param message the message
     * @param cause the cause
     */
    public NotImplementedException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * The Constructor.
     * 
     * @param message the message
     */
    public NotImplementedException(final String message) {
        super(message);
    }

    /**
     * The Constructor.
     * 
     * @param cause the cause
     */
    public NotImplementedException(final Throwable cause) {
        super(cause);
    }

    /**
     * The Constructor.
     * 
     * @param enumCase the enum case
     */
    public NotImplementedException(final Enum<?> enumCase) {
        this("case " + enumCase.name() + " is not implemented");
    }

}
