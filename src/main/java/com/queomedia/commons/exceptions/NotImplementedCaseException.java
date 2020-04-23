/**
 * 
 */
package com.queomedia.commons.exceptions;

/**
 * This exception indicates that a case (typical in a {@code switch} statement) is not implemented.
 * 
 * <p>
 * A typical use case is a {@code switch} statement for an {@code enumg}. In such a switch statement throw this
 * exception in the {@code default} case
 * </p>
 * <pre><code>
 * switch(demoEnum) {
 *    case A: return somethingBecauseA();
 *    case B: return somethingBecauseA();
 *    default: throw new NotImplementedCaseException(demoEnum);
 * }
 * </code></pre>
 * 
 *
 */
public class NotImplementedCaseException extends NotImplementedException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6806680927029285098L;

    /**
     * Instantiates a new not implmented case execption.
     */
    public NotImplementedCaseException() {
        super();
    }

    /**
     * The Constructor.
     * 
     * @param message the message
     * @param cause the cause
     */
    public NotImplementedCaseException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * The Constructor.
     * 
     * @param message the message
     */
    public NotImplementedCaseException(final String message) {
        super(message);
    }

    /**
     * The Constructor.
     * 
     * @param cause the cause
     */
    public NotImplementedCaseException(final Throwable cause) {
        super(cause);
    }

    /**
     * The Constructor.
     * 
     * @param enumCase the enum case
     */
    public NotImplementedCaseException(final Enum<?> enumCase) {
        this("case " + enumCase.name() + " is not implemented");
    }

}
