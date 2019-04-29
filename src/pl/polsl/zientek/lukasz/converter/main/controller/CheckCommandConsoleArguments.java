package pl.polsl.zientek.lukasz.converter.main.controller;

import pl.polsl.zientek.lukasz.converter.main.model.arabicroman.*;
import pl.polsl.zientek.lukasz.converter.main.model.romanarabic.*;
import pl.polsl.zientek.lukasz.converter.main.view.View;

import java.util.List;

/**
 * Checks if input given by user is correct
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class CheckCommandConsoleArguments
{
    /**
     * initialization of object of the class View
     */
    private View view = new View();

    /**
     * Method checks if input given by user is correct (if it has a switch and a argument, at this point program is not checking if arguments are correct)
     * If input is correct it provides it into suitable methods
     * @param input argument given by user via command line
     */
    public void checkArguments(List<String> input)
    {
        int i = 0; // position in arguments

        // check every argument
        while (i < input.size())
        {
            // if argument starts with a switch and there exists next argument which is not a switch
            if (input.get(i).startsWith("-") && i < input.size()-1 && !input.get(i+1).startsWith("-"))
            {
                    // arabic to roman conversion
                    if (input.get(i).equals("-r"))
                    {
                        // try to convert given input into roman numeral
                        try
                        {
                           view.viewArabicToRoman(input.get(i+1), new ArabicToRoman().convertArabicToRoman(input.get(i),input.get(i+1)));
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
                    else if (input.get(i).equals("-a"))
                    {
                        // try to convert given input into arabic number
                        try
                        {
                            view.viewRomanToArabic(input.get(i+1), new RomanToArabic().convertRomanToArabic(input.get(i),input.get(i+1)));
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
                        view.unrecognizedSwitch(input.get(i));
                        i+=2;
                    }
            }

            else
            {
                if (input.get(i).equals("-r") || input.get(i).equals("-a"))
                    //print message about missing argument
                    view.missingArgument(input.get(i));

                else if (input.get(i).startsWith("-"))
                    //print message about unrecognizedSwitch
                    view.unrecognizedSwitch(input.get(i));

                else
                    // print message about missing switch
                        view.missingSwitch(input.get(i));

                //move position in arguments by 1
                i++;
            }
        }
    }
}