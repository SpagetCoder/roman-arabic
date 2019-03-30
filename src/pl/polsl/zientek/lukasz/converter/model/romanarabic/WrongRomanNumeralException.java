package pl.polsl.zientek.lukasz.converter.model.romanarabic;

/**
 * Exception which will be thrown if input given by user is not a correct roman numeral
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class WrongRomanNumeralException extends Exception
{
    private String previousInput;
    private String input;

    public WrongRomanNumeralException(String previousInput, String input)
    {
        this.previousInput = previousInput;
        this.input = input;
    }

    @Override
    public String toString() { return previousInput + (" ") + input + " - given argument is not a correct roman numeral" + "\n"; }

}
