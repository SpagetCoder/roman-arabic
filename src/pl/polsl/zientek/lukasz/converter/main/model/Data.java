package pl.polsl.zientek.lukasz.converter.main.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class data which hold all the necessary data for algorithm to work
 * @author Lukasz Zientek
 * @version 1.0.1
 */
public class Data
{
    /**
     * Method which returns list of arabic numbers
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
     * Method which returns list of roman numerals
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
