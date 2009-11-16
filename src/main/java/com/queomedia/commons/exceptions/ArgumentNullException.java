package com.queomedia.commons.exceptions;

/**
 * The Class ArgumentNullException.
 */
public class ArgumentNullException extends IllegalArgumentException {

    /** serialVersionUID. */
    private static final long serialVersionUID = -1669258323885204475L;

    /** Name of the argument that should not be null. */
    private String argument;

    /**
     * c-tor.
     * 
     * @param argument argument name
     */
    public ArgumentNullException(final String argument) {
        super("argument '" + argument + "' is null");
        this.argument = argument;
    }

    /**
     * The Constructor.
     * 
     * @param argument the argument
     * @param message the message
     */
    public ArgumentNullException(final String argument, final String message) {
        super(message);
        this.argument = argument;
    }

    /**
     * The Constructor.
     * 
     * @param argument the argument
     * @param message the message
     * @param cause the cause
     */
    public ArgumentNullException(final String argument, final String message, final Throwable cause) {
        super(message, cause);
        this.argument = argument;
    }

    /**
     * The Constructor.
     * 
     * @param argument the argument
     * @param cause the cause
     */
    public ArgumentNullException(final String argument, final Throwable cause) {
        super("argument '" + argument + "' is null", cause);
        this.argument = argument;
    }

    /**
     * Name of the argument that should not be null.
     * 
     * @return Returns the argument.
     */
    public String getArgument() {
        return this.argument;
    }

    /**
     * To string.
     * 
     * @return the string
     */
    @Override
    public String toString() {
        return super.toString() + " null argument : " + this.getArgument();
    }
      
}
