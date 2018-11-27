import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SilniaTest {

    @Test
   public void shouldReturnZeroValue(){
        //given
        Silnia silnia=new Silnia();
        //when
        int result=silnia.calculate(0);
        //then
        assertEquals(1, result);
    }

    @Test
    public void shouldReturnyewaia() {
        //given
        Silnia silnia = new Silnia();
        //when
        int result = silnia.calculate(5);
        //then
        assertEquals(1, result);
    }
}