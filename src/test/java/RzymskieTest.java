import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RzymskieTest {

  /* //Moje próby
    @ParameterizedTest
    @ValueSource(strings ={"V","XI","IV"})
    public int should1ReturnZeroIfEmpty(){
        //given
        //when
        //then
        return 0;
    }
    @ParameterizedTest
    @ValueSource(strings ={"V","XI","IV"})
    public String AllStingsShould2BeRzymskiIfNoReturnZero(){
        //given
        Rzymskie rzymskie=new Rzymskie();
        //when

        //then
        return "Zero";
    }
    @ParameterizedTest
    @ValueSource(strings ={"V","XI","IV"})
    public int should3ConvertOneDigiteOfRzymska(){
        //given
        Rzymskie rzymskie=new Rzymskie();
        //when

        //then
        return 6;
    }
    @ParameterizedTest
    @ValueSource(strings ={"V","XI","IV"})
    public int should4ConvertRomaDigiteWithNierosnacyDigit(){
        //given
        Rzymskie rzymskie=new Rzymskie();
        //when
        //then
        return 6;
    }
    @ParameterizedTest
    @ValueSource(strings ={"V","XI","IV"})
    public int should5ConvertEveryRomaDigiteOnInteger(){
        //given
        Rzymskie rzymskie=new Rzymskie();
        //when

        //then
        return 6;
    }
    */
  @Test
  public void shouldReturn0IfRomanNumberIsEmpty() {
      //given
      Rzymskie Rzymskie = new Rzymskie();
      //when
      int result = Rzymskie.roman2arabic("");
      //then
      assertEquals(0, result);
  }

    @Test
    public void shouldReturn0IfNumberContainsNotOnlyRzymskie() {
        //given
        Rzymskie Rzymskie = new Rzymskie();
        //when
        int result = Rzymskie.roman2arabic("IV");
        //then
        assertEquals(4, result);
    }

    @Test
    public void shouldReturnArabicValueForSingleRomanNumber() {
        //given
        Rzymskie rzymskie = new Rzymskie();
        //when
        int result = rzymskie.roman2arabic("M");
        //then
        assertEquals(1000, result);
    }

    @Test
    public void shouldReturnArabicValueForSortedRomanNumber() {
        //given
        Rzymskie rzymskie = new Rzymskie();
        //when
        int result = rzymskie.roman2arabic("MDXX");
        //then
        assertEquals(1520, result);
    }

    @ParameterizedTest
    @ValueSource(strings ={"III","IV","IX"})
    public void shouldReturnArabicValueForUnsortedRomanNumber(String para) {
        //given
        Rzymskie rzymskie = new Rzymskie();
        //when
        int result = rzymskie.roman2arabic(para);
        //then
        assertEquals(3, result);
    }
}