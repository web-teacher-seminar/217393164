import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.LinkedList;

public class Set<k> {
    final int m = 10;
    private LinkedList<k>[] array;

    public Set() {
        array = new LinkedList[m];
        for (int i = 0; i < m; i++)
            array[i] = new LinkedList<>();
    }

    public int hashCode(k key) {
        return (int) key % m;

    }

    public boolean find(k key) {
        LinkedList<k> f = array[hashCode(key)];
        for (k o : f) {
            if (o == key)
                return true;
        }
        return false;
    }

    public void add(k key) {
        if (find(key))
            return;
        array[hashCode(key)].add(key);
    }

    public void remove(k key) {
        if (!find(key))
            return;
        array[hashCode(key)].remove(key);
    }

    @Override
    public String toString() {
        return "Set{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
