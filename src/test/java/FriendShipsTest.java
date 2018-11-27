import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FriendShipsTest {
private FriendShips friendships;

    @BeforeEach // wykonanie przed kazdym testem
    //@AfterEach - wykonanie po kazdym tescie
    //@BeforeAll - wykonanie raz przed wszystkimi testami (metoda musi byc statyczna, poniewaz nie ma jeszcze obiektu)
    //@AfterAll - wykonanie raz po wszystkich testach
    public void setUp() {
        friendships = new FriendShips();
    }

    @Test
    //@DisplayName("My display name for my display test")
    public void shouldAddTwoPersonAsFriends() {
        //given
//        Friendships friendships = new Friendships();
        //when
        friendships.makeFriends("Ala", "Jacek");
        //then
        List<String> friend = friendships.getFriends("Ala");
        assertTrue(friend.contains("Jacek"));
    }

    @Test
    //@RepeatedTest(100)
    //@Disabled
    public void shouldReturnEmptyListWithFriends() {
        //given
//        Friendships friendships = new Friendships();
        //when
        List<String> friends = friendships.getFriends("Karolina");
        //then
        assertTrue(friends.isEmpty());
    }

    @Test
    public void twoPersonShouldBeFriends() {
        //given
//        Friendships friendships = new Friendships();
        friendships.makeFriends("Ala", "Jacek");
        //when
        boolean areFriends = friendships.areFriends("Ala", "Jacek")
                && friendships.areFriends("Jacek", "Ala");
        //then
        assertTrue(areFriends);
    }

}