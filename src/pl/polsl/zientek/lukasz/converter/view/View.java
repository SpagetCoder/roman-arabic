package pl.polsl.zientek.lukasz.converter.view;

/**
 * The view class - responsible for viewing messages
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class View
{
    /**
     * Prints arabic number converted into roman numeral
     * @param Arabic number which is being converted to roman numeral
     * @param Roman roman numeral received after conversion
     */
    public void viewArabicToRoman(long Arabic, StringBuilder Roman)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Arabic).append(" converted to roman numeral = ").append(Roman).append("\n");
        System.out.println(stringBuilder);
    }

    /**
     * Prints roman numeral converted into arabic number
     * @param Roman roman numeral which is being converted to arabic number
     * @param Arabic arabic roman obtained after conversion
     */
    public void viewRomanToArabic(String Roman,int Arabic)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Roman).append(" converted to arabic number = ").append(Arabic).append("\n");
        System.out.println(stringBuilder);
    }

    /**
     * Prints message about wrong number ( larger than 3999)
     * @param input argument given by user via command line
     * @param previousInput argument given by user via command line
     */
    public void greaterError(String previousInput,String input)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(previousInput).append(" ").append(input).append(" - number cannot be more than 3999").append("\n");
        System.out.println(stringBuilder);
    }

    /**
     * Prints message about wrong number (less than 1)
     * @param input argument given by user via command line
     * @param previousInput argument given by user via command line
     */
    public void lessError(String previousInput,String input)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(previousInput).append(" ").append(input).append(" - number cannot be less than 1").append("\n");
        System.out.println(stringBuilder);
    }

    /**
     * Prints message about wrong input for arabic to roman conversion
     * @param input argument given by user via command line
     * @param previousInput argument given by user via command line
     */
    public void invalidInputArabic(String previousInput,String input)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(previousInput).append(" ").append(input).append(" - given argument is not a correct arabic number").append("\n");
        System.out.println(stringBuilder);
    }

    /**
     * Prints message about wrong input for roman to arabic conversion
     * @param previousInput argument given by user via command line
     * @param input input argument given by user via command line
     */
    public void invalidInputRoman(String previousInput,String input)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(previousInput).append(" ").append(input).append(" - given argument is not a correct roman numeral").append("\n");
        System.out.println(stringBuilder);
    }

    /**
     * Prints message about unrecognized switch
     * @param input argument given by user via command line
     */
    public void unrecognizedSwitch(String input)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input).append( " - unrecognized switch").append("\n");
        System.out.println(stringBuilder);
    }

    /**
     * Prints message about missing argument (user provided switch without argument)
     * @param input argument given by user via command line
     */
    public void missingArgument(String input)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input).append( " - missing argument").append("\n");
        System.out.println(stringBuilder);
    }

    /**
     * Prints message about missing switch for arabic to roman numeral conversion (user provided argument without switch -a)
     * @param input argument given by user via command line
     */
    public void missingSwitchArabic(String input)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input).append( " - argument given without switch. Missing: ").append("-a").append("\n");
        System.out.println(stringBuilder);
    }

    /**
     * Prints message about missing switch for roman to arabic number conversion (user provided argument without switch -r)
     * @param input argument given by user via command line
     */
    public void missingSwitchRoman(String input)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input).append( " - argument given without switch. Missing: ").append("-r").append("\n");
        System.out.println(stringBuilder);
    }
}
