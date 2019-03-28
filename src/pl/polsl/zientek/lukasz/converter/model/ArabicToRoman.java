package pl.polsl.zientek.lukasz.converter.model;

/**
 *  The ArabicToRoman class responsible for converting arabic number into roman numeral
 *  @author Lukasz Zientek
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
    private final char [] arabicNumber = {1000, 500, 100, 50, 10, 5, 1};

    /**
     * Algorithm which converts arabic numbers into roman numerals
     * @param number number given by user
     * @return result - roman numeral obtained after performing conversion
     */
    public StringBuilder convertArabicToRoman (long number)
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

        return result;
    }

}
