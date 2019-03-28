package pl.polsl.zientek.lukasz.converter;

import pl.polsl.zientek.lukasz.converter.controller.CheckCommandConsoleArguments;

/**
 * Main class initializing run of the program
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class Main
{
    /**
     * Main runs the program
     * @param args arguments given in command line
     */
    public static void main(String[] args)
    {
        new CheckCommandConsoleArguments().checkArguments(args);
    }
}