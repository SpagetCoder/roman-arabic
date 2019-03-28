package pl.polsl.zientek.lukasz.converter.controller;

import pl.polsl.zientek.lukasz.converter.model.ArabicToRoman;
import pl.polsl.zientek.lukasz.converter.view.View;

/**
 * The CheckArabic class - responsible for checking if input given by user is correct
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class CheckArabic
{
    /**
     * initialization of object of the class View
     */
    private View view = new View();

    /**
     * initialization of object of the class CheckCommandLinesArguments
     */
    private CheckCommandConsoleArguments checkArguments = new CheckCommandConsoleArguments();

    /**
     * Method checks if input given by user is a correct arabic number
     * @param input argument given by user via command line
     * @param previousInput argument given by user via command line
     */
    public void checkIfCorrectArabic(String previousInput, String input)
    {
        // checks if input given by user is a number
        if (checkArguments.isNumber(input))
        {
            Long x = Long.parseLong(input);

            // if user tries to convert number greater than 3999 display error message
            if(x > 3999)
            {
                view.greaterError(previousInput,input);
            }

            // if user tries to convert number which is less than 1 display error message
            else if(x <= 0)
            {
                view.lessError(previousInput,input);
            }

            else
            {
                ArabicToRoman a2r = new ArabicToRoman();
                // Printing the result
                view.viewArabicToRoman(x,a2r.convertArabicToRoman(x));
            }
        }
        else
            view.invalidInputArabic(previousInput,input);
    }
}
