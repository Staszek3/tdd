import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PeselMainTest {
  // @ParameterizedTest
  //  @ValueSource(ints={5,10,50})
    @ParameterizedTest
    @ValueSource(strings ={"64091903457","76091903457","12032805734"})
    private void Test1isValidPesel(String param) {
        //given
        PeselMain peselMain=new PeselMain();
        //when
        boolean pesel=peselMain.isValidPesel(param);
        //then
        assertEquals(true,pesel);
    }
}