package pl.polsl.zientek.lukasz.converter.main.view;

/**
 * The view class responsible for viewing messages
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class View
{
    /**
     * Prints exception message from toString() method
     * @param e exception which occured
     */
    public void printMessage(Exception e) { System.out.println(e); }

    /**
     * Prints arabic number converted into roman numeral
     * @param arabic number which is being converted to roman numeral
     * @param roman roman numeral received after conversion
     */
    public void viewArabicToRoman(String arabic, String roman)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(arabic).append(" converted to roman numeral = ").append(roman).append("\n");
        System.out.println(stringBuilder);
    }

    /**
     * Prints roman numeral converted into arabic number
     * @param roman roman numeral which is being converted to arabic number
     * @param arabic arabic roman obtained after conversion
     */
    public void viewRomanToArabic(String roman,long arabic)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(roman).append(" converted to arabic number = ").append(arabic).append("\n");
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
     * Prints message about missing switch
     * @param input argument given by user via command line
     */
    public void missingSwitch(String input)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input).append( " - argument given without switch.").append("\n");
        System.out.println(stringBuilder);
    }
}
