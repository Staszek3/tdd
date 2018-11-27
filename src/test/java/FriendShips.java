import java.util.*;

public class FriendShips {

//    private final Map<String, List<String>> friend=new HashMap<>();
//
//    public void makeFriends (String person, String friend){
//        if(!friend.containsKey(person))
//
//            friend.put(person),new ArrayList<>();
//        friend.get(person).add(friend);
//    }
//    public List<String> getFriend("Ala"){
//        return friend.get(person);
//    }
//
//    public boolean areFriends(String firstPerson, String secundPerson){
//        return friend.containsKey(firstPerson)
//                && friend.containsKey(secundPerson)
//                && friend.get(firstPerson).contains(secundPerson)
//                && friend.get(secundPerson).contains(firstPerson);
//
//    }
private final Map<String, List<String>> friendships = new HashMap();

    public void makeFriends(String firstPerson, String secondPerson) {
        addFriend(firstPerson, secondPerson);
        addFriend(secondPerson, firstPerson);
    }

    private void addFriend(String firstPerson, String secondPerson) {
        if (!friendships.containsKey(firstPerson)) {
            friendships.put(firstPerson, new ArrayList());
        }
        friendships.get(firstPerson).add(secondPerson);
    }

    public List<String> getFriends(String person) {
        if (!friendships.containsKey(person))
            return Collections.emptyList(); // to samo co return new ArrayList<>();
        return friendships.get(person);
    }

    public boolean areFriends(String firstPerson, String secondPerson) {
        return friendships.containsKey(firstPerson)
                && friendships.containsKey(secondPerson)
                && friendships.get(firstPerson).contains(secondPerson)
                && friendships.get(secondPerson).contains(firstPerson);
    }
}
