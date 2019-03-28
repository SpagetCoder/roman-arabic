package pl.polsl.zientek.lukasz.converter.controller;

import pl.polsl.zientek.lukasz.converter.view.View;

/**
 * The Main menu class - responsible for control of the menu
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
     * Method checks if given input is a number
     * @param input argument given by user
     * @return true if given input is a number
     * @throws NumberFormatException if given input is not a number
     */
    public boolean isNumber(String input) throws NumberFormatException
    {
        try
        {
            Long.parseLong(input);
            return true;
        }
        catch(NumberFormatException x)
        {
            return false;
        }
    }

    /**
     * Method checks input given by user, if input is correct it provides it into suitable methods
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
                if (input[i].equals("-a"))
                {
                    // creating object checkArabic of class CheckArabic
                    CheckArabic checkArabic = new CheckArabic();
                    // checking if input given by user is correct for converting into roman numerals
                    checkArabic.checkIfCorrectArabic(input[i],input[i+1]);
                    //move position in arguments by 2
                    i+=2;
                }

                else if (input[i].equals("-r"))
                {
                    // creating object checkRoman of class CheckRoman
                    CheckRoman checkRoman = new CheckRoman();
                    // checking if input given by user is correct for converting into arabic numbers
                    checkRoman.checkIfCorrectRoman(input[i],input[i+1]);
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
                if (input[i].equals("-a") || input[i].equals("-r"))
                    //print message about missing argument
                    view.missingArgument(input[i]);

                else if (input[i].startsWith("-"))
                {
                    view.unrecognizedSwitch(input[i]);
                }

                else
                    // print message about missing switch
                    if(isNumber(input[i]))
                        view.missingSwitchArabic(input[i]);

                    else
                        view.missingSwitchRoman(input[i]);

                //move position in arguments by 1
                i++;
            }
        }
    }

}
