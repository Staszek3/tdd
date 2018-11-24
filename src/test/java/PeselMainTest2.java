import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PeselMainTest2 {
    @ParameterizedTest
    @ValueSource(strings ={"64091903457","76091903457","12032805734"})
    public void Test1isValidPesel(String para) {
        //given
        PeselMain peselMain=new PeselMain();
        //when
        boolean pesel=peselMain.isValidPesel(para);
        //then
        assertEquals(true,pesel);
    }
    //czy zwroci false gdy są cyfry
    @ParameterizedTest
    @ValueSource(strings ={"6409fd03457","76091903457","12032805734"})
    public void Test2PeselIsFalseWhenCyfry(String para) {
        //given
        PeselMain peselMain=new PeselMain();
        //when
        boolean pesel=peselMain.isValidPesel(para);
        //then
        assertEquals(false,pesel);
    }
    //czy zwroci false gdy jest wiecej lub mniej niz 11 liczb
    @ParameterizedTest
    @ValueSource(strings ={"6409fd0345790","760919034","120328734"})
    public void Test3PeselIsFalseWhenOver11Cyfr(String para) {
        //given
        PeselMain peselMain=new PeselMain();
        //when
        boolean pesel=peselMain.isValidPesel(para);
        //then
        assertEquals(false,pesel);
    }
    //czy zwroci false gdy podamy 11 zmyślonych liczb
    @ParameterizedTest
    @ValueSource(strings ={"64091903457","76091903447","64091903437"})
    public void Test4PeselIsFalseWhenAnother11Cyfr(String para) {
        //given
        PeselMain peselMain=new PeselMain();
        //when
        boolean pesel=peselMain.isValidPesel(para);
        //then
        assertEquals(false,pesel);
    }
}