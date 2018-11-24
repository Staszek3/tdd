import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    @Test
    public void shouldReturnTrueIfAgeIs18(){
        //given
        Validator validator=new Validator();
        //when
        boolean isAdult=validator.isAdult(18);
        //then
        assertEquals(true,isAdult);
       // assertTrue(isAdult);
    }
    @Test
    public void shouldReturnTrueIfAgeIs17(){
        //given
        Validator validator=new Validator();
        //when
        boolean isAdult=validator.isAdult(17);
        //then
        assertEquals(false,isAdult);
        // assertFalse(isAdult);
    }
    @Test
    public void shouldReturnTrueIfAgeIs19(){
        //given
        Validator validator=new Validator();
        //when
        boolean isAdult=validator.isAdult(19);
        //then
        assertEquals(true,isAdult);
        // assertTrue(isAdult);
    }

}