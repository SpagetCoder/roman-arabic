package pl.polsl.zientek.lukasz.converter.model.arabicroman;

/**
 * Exception which will be thrown if input given by user is not a number
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class WrongArabicNumberException extends Exception
{
    private String previousInput;
    private String input;

    public WrongArabicNumberException(String previousInput, String input)
    {
        this.previousInput = previousInput;
        this.input = input;
    }

    @Override
    public String toString() { return previousInput + (" ") + input + " - given argument is not a correct arabic number" + "\n"; }}
