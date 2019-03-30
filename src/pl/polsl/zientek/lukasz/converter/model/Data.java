package pl.polsl.zientek.lukasz.converter.model;

import java.util.ArrayList;
import java.util.List;

public class Data
{
    /**
     * Method which return list of arabic numbers
     * @return list of arabic numbers
     */
    public List<Integer> getArabicNumber()
    {
        List<Integer> arabicNumber = new ArrayList<>();
        arabicNumber.add(1000);
        arabicNumber.add(500);
        arabicNumber.add(100);
        arabicNumber.add(50);
        arabicNumber.add(10);
        arabicNumber.add(5);
        arabicNumber.add(1);

        return arabicNumber;
    }

    /**
     * Method which return list of roman numerals
     * @return list of roman numerals
     */
    public List<Character> getRomanNumeral()
    {
        List<Character> romanNumeral = new ArrayList<>();
        romanNumeral.add('M');
        romanNumeral.add('D');
        romanNumeral.add('C');
        romanNumeral.add('L');
        romanNumeral.add('X');
        romanNumeral.add('V');
        romanNumeral.add('I');

        return romanNumeral;
    }
}
