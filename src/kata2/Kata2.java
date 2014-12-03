package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 1, 5, 1, 10};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            frequencyMap.put(number, getFrequency(frequencyMap, number) + 1);
        }

        int number = -1;
        int maxOcurrences = 0;

        for (Integer key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > maxOcurrences) {
                number = key;
                maxOcurrences = frequencyMap.get(key);
            }
        }

        System.out.println(number + "->" + maxOcurrences);
    }

    private static int getFrequency(HashMap<Integer, Integer> frequencyMap, int number) {
        if (frequencyMap.containsKey(number)) {
            return frequencyMap.get(number);
        }
        return 0;
    }
}
