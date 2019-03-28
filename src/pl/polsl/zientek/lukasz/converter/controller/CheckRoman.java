package pl.polsl.zientek.lukasz.converter.controller;

import pl.polsl.zientek.lukasz.converter.model.RomanToArabic;
import pl.polsl.zientek.lukasz.converter.view.View;

/**
 * The CheckRoman class - responsible for checking if input given by user is correct
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class CheckRoman
{
    /**
     * initialization of object of the class view
     */
    private View view = new View();

    /**
     * Method checks if input given by user is a correct roman numeral
     * @param input argument given by user via command line
     * @param previousInput argument given by user via command line
     */
    public void checkIfCorrectRoman(String previousInput, String input)
    {
        if(input.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"))
        {
            RomanToArabic r2a = new RomanToArabic();
            view.viewRomanToArabic(input,r2a.convertRomanToArabic(input));
        }

        // display error message
        else view.invalidInputRoman(previousInput,input);
    }

}
