import org.junit.Assert;
import org.junit.Test;

public class TestRomanNumbers {
    @Test
    public void testConversion() {
        String str = "XXI";
        int expected = 21;
        int actual = RomanNumbers.convertRoman(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConversion2() {
        String str = "IV";
        int expected = 4;
        int actual = RomanNumbers.convertRoman(str);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConversion3(){
        String str = "III";
        int expected = 3;
        int actual =RomanNumbers.convertRoman(str);
        Assert.assertEquals(expected, actual);
    }
}

