package pl.polsl.zientek.lukasz.converter.model.arabicroman;

/**
 * Exception which will be thrown if number given by user is too big
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class NumberTooBigException extends Exception
{
    private String previousInput;
    private String input;

    public NumberTooBigException(String previousInput, String input)
    {
        this.previousInput = previousInput;
        this.input = input;
    }

        @Override
        public String toString() { return previousInput + (" ") + input + " - number cannot be more than 3999" + "\n"; }
}
