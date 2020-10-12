import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.Assert.assertEquals;

public class TestLeapYear {
    NumberFormatter nf = new NumberFormatter();



    @ParameterizedTest
    @ValueSource(ints = {4, 8, 12, 16, 20, 24})
    public void testDividesByFourResultsInLeapYear(int n){
        assertEquals("Skuddår", nf.formatNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {2100, 1700, 1800, 1900})
    public void testDividesByHundredResultsInNotLeapYear(int n){
        assertEquals("Ikke skuddår",nf.formatNumber(n));

    }


    @ParameterizedTest
    @ValueSource(ints = {2000, 1200, 1600, 2400})
    public void testDividesByFourHundredResultsInLeapYearAfterAll(int n){
        assertEquals("Det var skuddår alikevel", nf.formatNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {4000, 8000, 12000})
    public void testDividesByFourThousandResultsInLeapYearInLongTime(int n){
        assertEquals("Lenge til, men skuddår", nf.formatNumber(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {2,6,7,5})
    public void testDoesNotDivideByFourResultsInNotLeapYear(int n){
        assertEquals("Ikke skuddår", nf.formatNumber(n));
    }
}
