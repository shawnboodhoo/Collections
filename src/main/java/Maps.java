import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Maps {

    public static void LoopMap(LinkedHashMap<String, String> favoriteFoods){
        for (Map.Entry<String, String> x: favoriteFoods.entrySet()){
            System.out.println(x);
        }
    }

    public static void remove(LinkedHashMap<String, String> favoriteFoods, String name, String food){
        favoriteFoods.remove(name, food);
        System.out.println(favoriteFoods);
    }

    public static void add(LinkedHashMap<String, String> favoriteFoods, String name, String food){
        favoriteFoods.put(name, food);
        System.out.println(favoriteFoods);
    }

    public static void clear(LinkedHashMap<String, String> favoriteFoods){
        favoriteFoods.clear();
        System.out.println(favoriteFoods);
    }

    public static void SwapKeys(LinkedHashMap<String, String> favoriteFoods){
        LinkedHashMap<String, String> newMap = new LinkedHashMap<>();
        for (Map.Entry<String, String> x: favoriteFoods.entrySet()){
            newMap.put(x.getValue(), x.getKey());
        }
        System.out.println(newMap);
    }

    public static void getIndex(LinkedHashMap<String, String>favoriteFoods, String keys){
        List<String> newList = new ArrayList<>(favoriteFoods.keySet());
        System.out.println(newList.indexOf(keys));
    }


    public static void main(String[] args) {

        LinkedHashMap<String, String> favoriteFoods = new LinkedHashMap<>();

        favoriteFoods.put("John", "BBQ");

        favoriteFoods.put("Shawn", "Pasta");

        favoriteFoods.put("Bob", "Pizza");

        LoopMap(favoriteFoods);

        remove(favoriteFoods, "Bob", "Pizza");

        clear(favoriteFoods);

        add(favoriteFoods, "Shawn", "Pasta");

        add(favoriteFoods, "Ryan", "Burgers");

        getIndex(favoriteFoods, "Ryan");

        SwapKeys(favoriteFoods);


    }
}
