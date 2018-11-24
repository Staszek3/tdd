import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzGeneratorTest {
    @Test
    public void shouldReturnFizzIfNumberPodzielnyPrzez3()
    {
        //given
        FizzBuzzGenerator fizzBuzzGenerator=new FizzBuzzGenerator();
        //when
        String result=fizzBuzzGenerator.generateSingleSeg(6);
        //then
        assertEquals("Fizz", result);

    }

    @ParameterizedTest
    @ValueSource(ints={5,10,50})
    public void shouldReturnBuzzIfNumberPodzielnyPrzez5()
    {
        //given
        FizzBuzzGenerator fizzBuzzGenerator=new FizzBuzzGenerator();
        //when
        String result=fizzBuzzGenerator.generateSingleSeg(5);
        //then
        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberPodzielnyPrzez2or5()
    {
        //given
        FizzBuzzGenerator fizzBuzzGenerator=new FizzBuzzGenerator();
        //when
        String result=fizzBuzzGenerator.generateSingleSeg(15);
        //then
        assertEquals("FizzBuzz", result);
    }
    @Test
    public void shouldReturnZeroIfNumberEquel0() {
        //given
        FizzBuzzGenerator fizzBuzzGenerator=new FizzBuzzGenerator();
        //when
        String result=fizzBuzzGenerator.generateSingleSeg(0);
        //then
        assertEquals("0", result);
    }
  /*  @Test
    public void shouldReturnFizzBuzzAndCiagLiczbIfNumberEgual_16()
    {
        //given
        FizzBuzzGenerator fizzBuzzGenerator=new FizzBuzzGenerator();
        //when
        String result=fizzBuzzGenerator.generateSingleSeg(16);
        //then
        assertEquals("1,2,Fizz4BuzzFizz78BuzzFizz11Buzz1314FizzBuzz16", result);
        }
 */


}
