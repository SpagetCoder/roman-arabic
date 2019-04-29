package pl.polsl.zientek.lukasz.converter.main.model.romanarabic;

import pl.polsl.zientek.lukasz.converter.main.model.Data;
import java.util.List;

/**
 * The RomanToArabic class responsible for converting roman numerals into arabic numbers
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class RomanToArabic
{
    /**
     * Algorithm which converts roman numerals into arabic numbers
     * @param input roman numeral given by user
     * @return arabic number obtained after conversion
     */
    public Long romanToArabicAlgorithm(String input)
    {
        Data data = new Data();
        // create new list for roman numerals
        List<Character> romanNumeral = data.getRomanNumeral();
        // create new list for arabic numbers
        List<Integer> arabicNumber = data.getArabicNumber();

        int i = 0;// position in list
        int j = 0; // position in roman numeral
        long result = 0L;

        // our position in roman numeral has to be less than length of this numeral and position in list has to be less than length of arabicNumber list
        while (j < input.length() && i < arabicNumber.size())
        {
            // if we find corresponding char, handling M, D , C etc
            if (input.charAt(j) == (romanNumeral.get(i)))
            {
                // add value to the result
                result += arabicNumber.get(i);
                // move position in roman numeral by 1
                j++;
            }

            // handling CM, XC etc
            else if ((i%2 == 0) && i < arabicNumber.size()-2 && j < input.length()-1 && input.charAt(j) == romanNumeral.get(i+2) &&
                    input.charAt(j+1) == romanNumeral.get(i))
            {
                result += arabicNumber.get(i)- arabicNumber.get(i+2);
                // move position in roman numeral by 2
                j+=2;
                // move position in list by 1
                i++;
            }

            // handling XL, IX etc
            else if ((i%2 == 1) && i < arabicNumber.size()-1 && j < input.length()-1 && input.charAt(j) == romanNumeral.get(i+1) &&
                    input.charAt(j+1) == romanNumeral.get(i))
            {
                result += arabicNumber.get(i)- arabicNumber.get(i+1);
                // move position in roman numeral by 2
                j+=2;
                // move position in list by 1
                i++;
            }

            else
                // move position in list by 1
                i++;
        }
        return result;
    }

    /**
     * Method checks if input given by user is a correct roman numeral, if so it will convert it into arabic number
     * @param input argument given by user via command line
     * @param previousInput argument given by user via command line
     * @return arabic number obtained after conversion
     * @throws WrongRomanNumeralException if input given by user is not a correct roman numeral
     */
    public Long convertRomanToArabic(String previousInput, String input) throws WrongRomanNumeralException
    {
        // checks if input is a correct roman numeral
        if(input.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"))
        {
            return romanToArabicAlgorithm(input);
        }

        // if given input is not a correct roman numeral
        else throw new WrongRomanNumeralException(previousInput,input);
    }
}
