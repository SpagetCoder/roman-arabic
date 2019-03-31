package pl.polsl.zientek.lukasz.converter.model.arabicroman;

/**
 * Exception which will be thrown if number given by user is too big
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class NumberTooBigException extends Exception
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
     * Constructor of class NumberTooBigException
     * @param previousInput first argument given by user
     * @param input second argument given by user
     */
    public NumberTooBigException(String previousInput, String input)
    {
        this.previousInput = previousInput;
        this.input = input;
    }

    /**
     * Overriding method to toString which prints message about occured exception
     * @return message about wrong number
     */
    @Override
    public String toString() { return previousInput + (" ") + input + " - number cannot be more than 3999" + "\n"; }
}
