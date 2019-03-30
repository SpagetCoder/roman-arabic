package pl.polsl.zientek.lukasz.converter.model.arabicroman;

/**
 * The ArabicToRoman class responsible for converting arabic number into roman numeral
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class ArabicToRoman
{
    /**
     * Array of roman numerals
     */
    private final char [] romanNumeral = {'M', 'D', 'C' , 'L', 'X', 'V', 'I'};
    /**
     * Array of arabic numbers
     */
    private final int [] arabicNumber = {1000, 500, 100, 50, 10, 5, 1};

    /**
     * Algorithm which converts arabic numbers into roman numerals
     * @param number number given by user
     * @return roman numeral obtained after performing conversion
     */
    public String arabicToRomanAlgorithm(long number)
    {
        StringBuilder result = new StringBuilder();
        int i = 0; // position in arrays

        // keep doing the algorithm until number > 0 or position in array is larger than length of this array
        while (number > 0 && i < arabicNumber.length)
        {
            // if number is bigger than value in array
            if (number >= arabicNumber[i])
            {
                // decrease number using corresponding value from array
                number -= arabicNumber[i];
                // add roman numeral to result
                result.append(romanNumeral[i]);
            }

            // handling CM, XC etc
            else if(i%2==0 && i < arabicNumber.length-2 && number >= arabicNumber[i]- arabicNumber[i+2])
            {
                // decrease number using corresponding value from array
                number -= arabicNumber[i]- arabicNumber[i+2];
                // add roman numeral to result
                result.append(romanNumeral[i+2]).append(romanNumeral[i]);
                // move position in array by 1
                i++;
            }

            // handling XL, IX etc
            else if(i%2==1 && i < arabicNumber.length-1 && number >= arabicNumber[i]- arabicNumber[i+1])
            {
                // decrease number using corresponding value from array
                number -= arabicNumber[i]- arabicNumber[i+1];
                // add roman numeral to result
                result.append(romanNumeral[i+1]).append( romanNumeral[i]);
                // move position in array by 1
                i++;
            }

            else
                // move position in array by 1
                i++;
        }

        return result.toString();
    }

    /**
     * Method checks if input given by user is a correct arabic number, if so it will convert it into roman numeral
     * @param input argument given by user via command line
     * @param previousInput argument given by user via command line
     * @return roman numeral obtained after performing conversion
     * @throws NumberTooSmallException if given number is too small
     * @throws NumberTooBigException if given number is too big
     * @throws WrongArabicNumberException if given number is not a correct arabic number
     */
    public String convertArabicToRoman(String previousInput, String input) throws NumberTooSmallException, NumberTooBigException, WrongArabicNumberException
    {
        // checks if input given by user is a number
        if (isNumber(input))
        {
            long x = Long.parseLong(input);

            // if user tries to convert number greater than 3999 throw NumberTooBigException
            if(x > 3999) throw new NumberTooBigException(previousInput,input);

            // if user tries to convert number which is less than 1 throw NumberTooSmallException
            else if(x <= 0) throw new NumberTooSmallException(previousInput,input);

            // print the result
            else return arabicToRomanAlgorithm(x);
        }
        else throw new WrongArabicNumberException(previousInput,input);
    }

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
}
