package pl.polsl.zientek.lukasz.converter.model.arabicroman;

/**
 * Exception which will be thrown if number given by user is too small
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class NumberTooSmallException extends Exception
{
    private String previousInput;
    private String input;

    public NumberTooSmallException(String previousInput, String input)
    {
        this.previousInput = previousInput;
        this.input = input;
    }

    @Override
    public String toString()
    {
        return previousInput + (" ") + input + " - number cannot be less than 0" + "\n";
    }
}
