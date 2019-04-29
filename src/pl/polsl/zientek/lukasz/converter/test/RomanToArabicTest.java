package pl.polsl.zientek.lukasz.converter.test;

import org.junit.Test;
import pl.polsl.zientek.lukasz.converter.main.model.romanarabic.RomanToArabic;
import pl.polsl.zientek.lukasz.converter.main.model.romanarabic.WrongRomanNumeralException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class RomanToArabicTest
{

    private final RomanToArabic test2 = new RomanToArabic();

    /**
     * Testing if program converts normal data correctly
     */
    @Test
    public void convertArabicToRomaTestNormalData()
    {
        try
        {
           assertEquals(test2.convertRomanToArabic("-a","MMXC"),2090L, 0.0);
        }

        catch (Exception x) { fail("Exception occured. Check if given data is correct");}
    }

    /**
     * Testing if program converts border situation correctly
     */
    @Test
    public void convertArabicToRomaTestBorderSituationLow()
    {
        try
        {
            assertEquals(test2.convertRomanToArabic("-a","I"),1L, 0.0);
        }

        catch (Exception x) { fail("Exception occured. Check if given data is correct");}
    }

    /**
     * Testing if program converts border situation correctly
     */
    @Test
    public void convertArabicToRomaTestBorderSituationHigh()
    {
        try
        {
            assertEquals(test2.convertRomanToArabic("-a","MMMCMXCIX"),3999L, 0.0);
        }

        catch (Exception x) { fail("Exception occured. Check if given data is correct");}
    }


    /**
     * Checks if exception is thrown if we provide incorrect data
     * @throws WrongRomanNumeralException if provided data is wrong
     */
    @Test(expected = WrongRomanNumeralException.class)
    public void convertArabicToRomaTestAbnormalData() throws WrongRomanNumeralException
    {
        // we are trying to convert arabic number to arabic number, program should throw exception about incorrect input
        test2.convertRomanToArabic("-a", "6424");
    }

    /**
     * Checks if exception is thrown if we provide incorrect data
     * @throws WrongRomanNumeralException if provided data is wrong
     */
    @Test(expected = WrongRomanNumeralException.class)
    public void convertArabicToRomaTestAbnormalData2() throws WrongRomanNumeralException
    {
        // we intentionally provide wrong data, program should throw exception about incorrect input
        test2.convertRomanToArabic("-a", "sample text");
    }


}