package kata2;

import java.util.HashMap;
import java.util.Set;

public class Kata2 {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 1, 5, 1, 10};
        HashMap<Integer, Integer> mymap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (mymap.containsKey(array[i])) {
                mymap.put(array[i], mymap.get(array[i]) + 1);
            } else{
                mymap.put(array[i], 1);
            }
        }

        Set<Integer> myset = mymap.keySet();
        Integer[] myarray = myset.toArray(new Integer[myset.size()]);
        int k, v;
        k = myarray[0];
        v = mymap.get(myarray[0]);
        for (int i = 1; i < myarray.length; i++) {
            if (mymap.get(myarray[i]) > k) {
                k = myarray[i];
                v = mymap.get(myarray[i]);
            }
        }

        System.out.println(k + ": " + v + " veces");
    }
}
