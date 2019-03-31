package pl.polsl.zientek.lukasz.converter.model.arabicroman;

/**
 * Exception which will be thrown if number given by user is too small
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class NumberTooSmallException extends Exception
{
    /**
     * String which stores first argument
     */
    private String previousInput;
    /**
     * String which stores second argument
     */
    private String input;

    /**
     * Constructor of class NumberToSmallException
     * @param previousInput first argument given by user
     * @param input second argument given by user
     */
    public NumberTooSmallException(String previousInput, String input)
    {
        this.previousInput = previousInput;
        this.input = input;
    }

    /**
     * Overriding method to toString which prints message about occured exception
     * @return message about wrong number
     */
    @Override
    public String toString()
    {
        return previousInput + (" ") + input + " - number cannot be less than 0" + "\n";
    }
}
