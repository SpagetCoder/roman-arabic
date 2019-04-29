package pl.polsl.zientek.lukasz.converter.test;

import org.junit.Test;
import pl.polsl.zientek.lukasz.converter.main.model.arabicroman.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ArabicToRomanTest
{
    private final ArabicToRoman test1 = new ArabicToRoman();

    @Test
    public void convertArabicToRomaTestNormalData()
    {
        try
        {
            assertEquals( test1.convertArabicToRoman("-r", "536"),"DXXXVI");
        }

        catch (Exception x) { fail("Exception occured. Check if given data is correct");}
    }

    @Test
    public void convertArabicToRomaTestBorderSituationLow()
    {
        try
        {
            assertEquals( test1.convertArabicToRoman("-r", "1"),"I");
        }

        catch (Exception x) { fail("Exception occured. Check if given data is correct");}
    }

    @Test
    public void convertArabicToRomaTestBorderSituationHigh()
    {
        try
        {
            assertEquals( test1.convertArabicToRoman("-r", "3999"),"MMMCMXCIX");
        }

        catch (Exception x) { fail("Exception occured. Check if given data is correct");}
    }

    @Test(expected = NumberTooBigException.class)
    public void convertArabicToRomaTestAbnormalDataHigh() throws NumberTooSmallException, NumberTooBigException, WrongArabicNumberException
    {
        // we are trying to convert number which is too big to be converted, program should throw exception about incorrect input
        test1.convertArabicToRoman("-r", "6000");
    }

    @Test(expected = NumberTooSmallException.class)
    public void convertArabicToRomaTestAbnormalDataLow() throws NumberTooSmallException, NumberTooBigException, WrongArabicNumberException
    {
        // we are trying to convert number which is too small to be converted, program should throw exception about incorrect input
        test1.convertArabicToRoman("-r", "-5346");
    }

    @Test(expected = WrongArabicNumberException.class)
    public void convertArabicToRomaTestAbnormalData() throws NumberTooSmallException, NumberTooBigException, WrongArabicNumberException
    {
        // we intentionally provide wrong data, program should throw exception about incorrect input
        test1.convertArabicToRoman("-r", "sample text");
    }

    @Test(expected = WrongArabicNumberException.class)
    public void convertArabicToRomaTestAbnormalData2() throws NumberTooSmallException, NumberTooBigException, WrongArabicNumberException
    {
        // we are trying to convert roman numeral into roman numeral, program should throw exception about incorrect input
        test1.convertArabicToRoman("-r", "MMM");
    }

}