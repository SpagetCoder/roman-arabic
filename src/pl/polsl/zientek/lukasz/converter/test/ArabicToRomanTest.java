package pl.polsl.zientek.lukasz.converter.test;

import org.junit.Test;
import pl.polsl.zientek.lukasz.converter.model.arabicroman.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArabicToRomanTest
{
    private ArabicToRoman test1 = new ArabicToRoman();

    @Test
    public void convertArabicToRomaTestNormalData()
    {
        try
        {
            assertEquals( test1.convertArabicToRoman("-r", "536"),"DXXXVI");
        }

        catch (Exception x) { }
    }

    @Test
    public void convertArabicToRomaTestBorderSituationLow()
    {
        try
        {
            assertEquals( test1.convertArabicToRoman("-r", "1"),"I");
        }

        catch (Exception x) { }
    }

    @Test
    public void convertArabicToRomaTestBorderSituationHigh()
    {
        try
        {
            assertEquals( test1.convertArabicToRoman("-r", "3999"),"MMMCMXCIX");
        }

        catch (Exception x) { }
    }

    @Test
    public void convertArabicToRomaTestAbnormalData()
    {

     boolean isThrown = false;

        try
        {
            test1.convertArabicToRoman("-r", "6000");
        }
        catch(NumberTooBigException x)
        {
            isThrown = true;
        }

        catch(NumberTooSmallException | WrongArabicNumberException x) { }

        assertTrue(isThrown);

    }


}