package pl.polsl.zientek.lukasz.converter.main;

import pl.polsl.zientek.lukasz.converter.main.controller.CheckCommandConsoleArguments;
import java.util.ArrayList;
import java.util.List;

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
        List<String> input = new ArrayList<>();

        for (String arguments: args)
        {
            input.add(arguments);
        }

        new CheckCommandConsoleArguments().checkArguments(input);
    }
}