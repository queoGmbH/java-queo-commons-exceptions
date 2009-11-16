/**
 * 
 */
package com.queomedia.commons.exceptions;


/**
 * Indicate that an specific error case is not implemented.
 * 
 *
 */
public class NotImplementedErrorException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3992412716404547639L;

    /**
     * The result object which contains the error for which no implementation exits.
     */
    private Object resultObject;

    /**
     * Instantiates a new not implemented error.
     */
    public NotImplementedErrorException() {
    }

    /**
     * The Constructor.
     * 
     * @param message the message
     */
    public NotImplementedErrorException(final String message) {
        super(message);
    }

    /**
     * The Constructor.
     * 
     * @param cause the cause
     */
    public NotImplementedErrorException(final Throwable cause) {
        super(cause);
    }

    /**
     * The Constructor.
     * 
     * @param message the message
     * @param cause the cause
     */
    public NotImplementedErrorException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * The Constructor.
     * 
     * @param resultObject The result object which contains the error for which no implementation exits.
     */
    public NotImplementedErrorException(final Object resultObject) {
        this("No implementation for result in " + resultObject);        
        this.resultObject = resultObject;        
    }

    public Object getResultObject() {
        return this.resultObject;
    }
    
    @Override
    public String toString() {     
        return super.toString() + " resultObject=" + resultObject;
    }
}
