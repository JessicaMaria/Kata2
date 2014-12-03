package kata2;

import java.util.ArrayList;
import java.util.Collections;

public class Kata2 {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 1, 5, 1, 10};
        ArrayList<Integer> numberList = new ArrayList<>();
        for (Integer integer : numbers) {
            numberList.add(integer);

        }

        Collections.sort(numberList);

        int previousNumber = -1;
        int previousOcurrences = 0;
        int maxOcurrences = 0;
        int maxNumber = -1;

        for (Integer number : numberList) {
            if (number != previousNumber) {
                if (previousOcurrences > maxOcurrences) {
                    maxNumber = previousNumber;
                    maxOcurrences = previousOcurrences;
                }
                previousOcurrences = 0;
                previousNumber = number;
            }
            previousOcurrences += 1;
        }
        System.out.println(maxNumber + "->" + maxOcurrences);
    }

}
