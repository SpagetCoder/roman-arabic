package pl.polsl.zientek.lukasz.converter.model;

/**
 * The RomanToArabic class responsible for converting roman numerals into arabic numbers
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class RomanToArabic
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
     * Algorithm which converts roman numerals into arabic numbers
     * @param RomanNumber roman numeral given by user
     * @return result - arabic number obtained after conversion
     */
    public int convertRomanToArabic (String RomanNumber)
    {
        int i = 0;// position in arrays
        int j = 0; // position in roman numeral
        int result = 0;

        // our position in roman numeral has to be less than length of this numeral and position in array has to be less than length of arabicNumber array
        while (j < RomanNumber.length() && i < arabicNumber.length)
        {
            // if we find corresponding char, handling M, D , C etc
            if (RomanNumber.charAt(j) == (romanNumeral[i]))
            {
                // add value to the result
                result += arabicNumber[i];
                // move position in roman numeral by 1
                j++;
            }

            // handling CM, XC etc
            else if ((i%2 == 0) && i < arabicNumber.length-2 && j < RomanNumber.length()-1 && RomanNumber.charAt(j) == romanNumeral[i+2] &&
                    RomanNumber.charAt(j+1) == romanNumeral[i])
            {
                result += arabicNumber[i]- arabicNumber[i+2];
                // move position in roman numeral by 2
                j+=2;
                // move position in array by 1
                i++;
            }

            // handling XL, IX etc
            else if ((i%2 == 1) && i < arabicNumber.length-1 && j < RomanNumber.length()-1 && RomanNumber.charAt(j) == romanNumeral[i+1] &&
                    RomanNumber.charAt(j+1) == romanNumeral[i])
            {
                result += arabicNumber[i]- arabicNumber[i+1];
                // move position in roman numeral by 2
                j+=2;
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
