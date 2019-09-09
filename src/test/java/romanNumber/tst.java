package romanNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class tst {

    @Test
    public void shouldReturnIfor1 () {
        assertEquals("I", RomanConverter.toRoman(1));
    }

    @Test
    public void shouldReturnIIfor2 () {
        assertEquals("II", RomanConverter.toRoman(2));
    }

    @Test
    public void shouldReturnIIIfor3 () {
        assertEquals("III", RomanConverter.toRoman(3));
    }

    @Test
    public void shouldReturnIVfor4 () {
        assertEquals("IV", RomanConverter.toRoman(4));
    }

    @Test
    public void shouldReturnVfor5 () {
        assertEquals("V", RomanConverter.toRoman(5));
    }

    @Test
    public void shouldReturnVIfor6 () {
        assertEquals("VI", RomanConverter.toRoman(6));
        assertEquals("VII", RomanConverter.toRoman(7));
        assertEquals("VIII", RomanConverter.toRoman(8));
    }

    @Test
    public void shouldReturnIXfor9 () {
        assertEquals("IX", RomanConverter.toRoman(9));
    }

    @Test
    public void shouldReturnXfor10 () {
        assertEquals("X", RomanConverter.toRoman(10));
    }

    @Test
    public void shouldCalculateMultiplesOfTen () {
        assertEquals("XXXVII", RomanConverter.toRoman(37));
    }

    @Test
    public void shouldCalculateSimpleDigits () {
        assertEquals("MMMDCCCLXXXVIII", RomanConverter.toRoman(3888));
    }

    @Test
    public void shouldCalculateFourDigits () {
        assertEquals("CDXLIV", RomanConverter.toRoman(444));
    }

    @Test
    public void shouldCalculateNineLikeDigits () {
        assertEquals("CMXCIX", RomanConverter.toRoman(999));
    }

}
