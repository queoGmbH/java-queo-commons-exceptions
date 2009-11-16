/**
 * 
 */
package com.queomedia.commons.exceptions;

/**
 * The Class NotImplmentedCaseExecption.
 * 
 * @author Engelmann
 */
public class NotImplmentedCaseExecption extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8423761710092209159L;

    /**
     * Instantiates a new not implmented case execption.
     */
    public NotImplmentedCaseExecption() {
        super();
    }

    /**
     * The Constructor.
     * 
     * @param message the message
     * @param cause the cause
     */
    public NotImplmentedCaseExecption(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * The Constructor.
     * 
     * @param message the message
     */
    public NotImplmentedCaseExecption(final String message) {
        super(message);
    }

    /**
     * The Constructor.
     * 
     * @param cause the cause
     */
    public NotImplmentedCaseExecption(final Throwable cause) {
        super(cause);
    }
    
    /**
     * The Constructor.
     * 
     * @param enumCase the enum case
     */
    public NotImplmentedCaseExecption(final Enum<?> enumCase) {
        this("case " + enumCase.name() + " is not implemented");
    }

}
