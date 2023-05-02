import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {

    public static void LoopList(List<String> strings){
        for (String x : strings){
            System.out.println(x);
        }
    }

    public static void Reverse(List<String> strings){
        Collections.reverse(strings);
        System.out.println(strings);
    }

    public static void SortOrder(List<String> strings){
        Collections.sort(strings);
        System.out.println(strings);
    }

    public static void Remove(List<String> strings, String name){
        strings.remove(name);
        System.out.println(strings);
    }

    public static void getIndex(List<String> strings, String name){
        System.out.println(strings.indexOf(name));
    }

    public static void contains(List<String> strings, String name){
        System.out.println(strings.contains(name));
    }

    public static void clear(List<String> strings){
        strings.clear();
        System.out.println(strings);
    }

    public static void Add(List<String> strings, String name){
        strings.add(name);
        System.out.println(strings);
    }

    public static void main(String[] args) {

        List<String> players = new ArrayList<>();

        players.add("kyrie");

        players.add("luka");

        players.add("lebron");

        LoopList(players);

        Reverse(players);

        SortOrder(players);

        Remove(players, "luka");

        getIndex(players, "kyrie");

        contains(players, "kyrie");

        clear(players);

        Add(players, "curry");


    }
}
