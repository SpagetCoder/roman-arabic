package pl.polsl.zientek.lukasz.converter.test;

import org.junit.Test;
import pl.polsl.zientek.lukasz.converter.model.romanarabic.RomanToArabic;
import pl.polsl.zientek.lukasz.converter.model.romanarabic.WrongRomanNumeralException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class RomanToArabicTest
{

    private RomanToArabic test2 = new RomanToArabic();

    @Test
    public void convertArabicToRomaTestNormalData()
    {
        try
        {
           assertEquals(test2.convertRomanToArabic("-a","MMXC"),2090L, 0.0);
        }

        catch (Exception x) { fail("Exception occured");}
    }

    @Test
    public void convertArabicToRomaTestBorderSituationLow()
    {
        try
        {
            assertEquals(test2.convertRomanToArabic("-a","I"),1L, 0.0);
        }

        catch (Exception x) { fail("Exception occured");}
    }

    @Test
    public void convertArabicToRomaTestBorderSituationHigh()
    {
        try
        {
            assertEquals(test2.convertRomanToArabic("-a","MMMCMXCIX"),3999L, 0.0);
        }

        catch (Exception x) { fail("Exception occured");}
    }


    @Test(expected = WrongRomanNumeralException.class)
    public void convertArabicToRomaTestAbnormalData() throws WrongRomanNumeralException
    {
        test2.convertRomanToArabic("-a", "6424");
    }


}