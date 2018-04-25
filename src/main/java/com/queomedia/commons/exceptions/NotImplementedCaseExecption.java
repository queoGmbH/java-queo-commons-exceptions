/**
 * 
 */
package com.queomedia.commons.exceptions;

/**
 * The Class NotImplementedCaseExecption.
 * 
 *
 * @deprecated use {@link NotImplementedCaseException} without twisted "ce" in "Exception".
 */
@Deprecated
public class NotImplementedCaseExecption extends NotImplementedException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8423761710092209159L;

    /**
     * Instantiates a new not implmented case execption.
     */
    public NotImplementedCaseExecption() {
        super();
    }

    /**
     * The Constructor.
     * 
     * @param message the message
     * @param cause the cause
     */
    public NotImplementedCaseExecption(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * The Constructor.
     * 
     * @param message the message
     */
    public NotImplementedCaseExecption(final String message) {
        super(message);
    }

    /**
     * The Constructor.
     * 
     * @param cause the cause
     */
    public NotImplementedCaseExecption(final Throwable cause) {
        super(cause);
    }

    /**
     * The Constructor.
     * 
     * @param enumCase the enum case
     */
    public NotImplementedCaseExecption(final Enum<?> enumCase) {
        this("case " + enumCase.name() + " is not implemented");
    }

}
