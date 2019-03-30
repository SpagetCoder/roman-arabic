package pl.polsl.zientek.lukasz.converter.controller;

import pl.polsl.zientek.lukasz.converter.model.arabicroman.*;
import pl.polsl.zientek.lukasz.converter.model.romanarabic.*;
import pl.polsl.zientek.lukasz.converter.view.View;

/**
 * Checks if input given by user is correct
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class CheckCommandConsoleArguments
{
    /**
     * initialization of object of the class view
     */
    private View view = new View();

    /**
     * Method checks if input given by user is correct (if it has a switch and a argument, at this point program is not checking if arguments are correct)
     * If input is correct it provides it into suitable methods
     * @param input argument given by user via command line
     */
    public void checkArguments(String[] input)
    {
        int i = 0; // position in arguments

        // check every argument
        while (i < input.length)
        {
            // if argument starts with a switch and there exists next argument which is not a switch
            if (input[i].startsWith("-") && i < input.length-1 && !input[i+1].startsWith("-"))
            {
                    // arabic to roman conversion
                    if (input[i].equals("-r"))
                    {
                        // try to convert given input into roman numeral
                        try
                        {
                           view.viewArabicToRoman(input[i+1], new ArabicToRoman().convertArabicToRoman(input[i],input[i+1]));
                        }

                        // print message about error
                        catch (NumberTooSmallException | NumberTooBigException | WrongArabicNumberException x)
                        {
                            view.printMessage(x);
                        }

                        //move position in arguments by 2
                        i+=2;
                    }

                    // roman to arabic conversion
                    else if (input[i].equals("-a"))
                    {
                        // try to convert given input into arabic number
                        try
                        {
                            view.viewRomanToArabic(input[i+1], new RomanToArabic().convertRomanToArabic(input[i],input[i+1]));
                        }

                        // print message about error
                        catch (WrongRomanNumeralException x)
                        {
                            view.printMessage(x);
                        }

                        //move position in arguments by 2
                        i+=2;
                    }

                    else
                    {
                        // print message about unrecognized switch
                        view.unrecognizedSwitch(input[i]);
                        i+=2;
                    }
            }

            else
            {
                if (input[i].equals("-r") || input[i].equals("-a"))
                    //print message about missing argument
                    view.missingArgument(input[i]);

                else if (input[i].startsWith("-"))
                    //print message about unrecognizedSwitch
                    view.unrecognizedSwitch(input[i]);

                else
                    // print message about missing switch
                        view.missingSwitch(input[i]);

                //move position in arguments by 1
                i++;
            }
        }
    }
}