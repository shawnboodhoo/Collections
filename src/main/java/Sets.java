import java.util.*;

public class Sets {

    public static void LoopSet(HashSet<String> x){
        for (String i: x){
            System.out.println(i);
        }
    }

    public static void contains(HashSet<String> x, String name){
        System.out.println(x.contains(name));
    }

    public static void remove(HashSet<String> x, String name){
        x.remove(name);
        System.out.println(x);
    }

    public static void add(HashSet<String> x, String name){
        x.add(name);
        System.out.println(x);
    }

    public static void size(HashSet<String> x){
        System.out.println(x.size());
    }


    public static void sort(HashSet<String> x){
        List<String> stringList = new ArrayList<>(x);
        Collections.sort(stringList);
        System.out.println(stringList);
    }

    public static void reverse(HashSet<String> x){
        List<String> stringList = new ArrayList<>(x);
        Collections.sort(stringList, Collections.reverseOrder());
        System.out.println(stringList);
    }

    public static void getIndex(HashSet<String> x, String name){
        List<String> stringList = new ArrayList<>(x);
        System.out.println(stringList.indexOf(name));
    }

    public static void clear(HashSet<String> x){
        x.clear();
        System.out.println(x);
    }



    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("shawn");

        names.add("swati");

        names.add("mem");

        names.add("junior");

        LoopSet(names);

        contains(names, "mem");

        remove(names, "junior");

        size(names);

        sort(names);

        reverse(names);

        getIndex(names, "mem");

        clear(names);


        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        for (int i =0; i <= 10; i++){
            if (numbers.contains(i)){
                System.out.println("number found " + i);
            } else {
                System.out.println("number not found " + i);
            }
        }

    }
}
