package pl.polsl.zientek.lukasz.converter.main.model.romanarabic;

/**
 * Exception which will be thrown if input given by user is not a correct roman numeral
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class WrongRomanNumeralException extends Exception
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
     * Constructor of class WrongRomanNumeralException
     * @param previousInput first argument given by user
     * @param input second argument given by user
     */
    public WrongRomanNumeralException(String previousInput, String input)
    {
        this.previousInput = previousInput;
        this.input = input;
    }

    /**
     * Overriding method to toString which prints message about occured exception
     * @return message about wrong number
     */
    @Override
    public String toString() { return previousInput + (" ") + input + " - given argument is not a correct roman numeral" + "\n"; }

}
