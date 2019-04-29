package pl.polsl.zientek.lukasz.converter.test;

import org.junit.Test;
import pl.polsl.zientek.lukasz.converter.main.model.arabicroman.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ArabicToRomanTest
{
    /**
     * ArabicToRoman object used for testing
     */
    private final ArabicToRoman test1 = new ArabicToRoman();

    /**
     * Testing if program converts normal data correctly
     */
    @Test
    public void convertArabicToRomaTestNormalData()
    {
        try
        {
            assertEquals( test1.convertArabicToRoman("-r", "536"),"DXXXVI");
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
            assertEquals( test1.convertArabicToRoman("-r", "1"),"I");
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
            assertEquals( test1.convertArabicToRoman("-r", "3999"),"MMMCMXCIX");
        }

        catch (Exception x) { fail("Exception occured. Check if given data is correct");}
    }

    /**
     * Checks if exception is thrown if we provide incorrect data
     * @throws NumberTooSmallException if given number is to smaller than 1
     * @throws NumberTooBigException if given number is biggerr than 3999
     * @throws WrongArabicNumberException if given input is not a correct arabic number
     */
    @Test(expected = NumberTooBigException.class)
    public void convertArabicToRomaTestAbnormalDataHigh() throws NumberTooSmallException, NumberTooBigException, WrongArabicNumberException
    {
        // we are trying to convert number which is too big to be converted, program should throw exception about incorrect input
        test1.convertArabicToRoman("-r", "6000");
    }

    /**
     * Checks if exception is thrown if we provide incorrect data
     * @throws NumberTooSmallException if given number is to smaller than 1
     * @throws NumberTooBigException if given number is biggerr than 3999
     * @throws WrongArabicNumberException if given input is not a correct arabic number
     */
    @Test(expected = NumberTooSmallException.class)
    public void convertArabicToRomaTestAbnormalDataLow() throws NumberTooSmallException, NumberTooBigException, WrongArabicNumberException
    {
        // we are trying to convert number which is too small to be converted, program should throw exception about incorrect input
        test1.convertArabicToRoman("-r", "-5346");
    }

    /**
     * Checks if exception is thrown if we provide incorrect data
     * @throws NumberTooSmallException if given number is to smaller than 1
     * @throws NumberTooBigException if given number is biggerr than 3999
     * @throws WrongArabicNumberException if given input is not a correct arabic number
     */
    @Test(expected = WrongArabicNumberException.class)
    public void convertArabicToRomaTestAbnormalData() throws NumberTooSmallException, NumberTooBigException, WrongArabicNumberException
    {
        // we intentionally provide wrong data, program should throw exception about incorrect input
        test1.convertArabicToRoman("-r", "sample text");
    }

    /**
     * Checks if exception is thrown if we provide incorrect data
     * @throws NumberTooSmallException if given number is to smaller than 1
     * @throws NumberTooBigException if given number is biggerr than 3999
     * @throws WrongArabicNumberException if given input is not a correct arabic number
     */
    @Test(expected = WrongArabicNumberException.class)
    public void convertArabicToRomaTestAbnormalData2() throws NumberTooSmallException, NumberTooBigException, WrongArabicNumberException
    {
        // we are trying to convert roman numeral into roman numeral, program should throw exception about incorrect input
        test1.convertArabicToRoman("-r", "MMM");
    }

}