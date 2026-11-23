import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Set set = new Set();
        set.add(5);
        set.add(6);
        set.add(75);
        System.out.println(set);
        System.out.println(set.find(55));
        set.remove(75);
        System.out.println(set);

    }
}