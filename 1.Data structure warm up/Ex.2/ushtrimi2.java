package Seminar;

import java.util.ArrayList;
import java.util.List;

public class ushtrimi2 {
    public static List<Integer> findEven(List<Integer> inputList) {
        List<Integer> result = new ArrayList<>();

        for (int num : inputList) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenIntegers = findEven(inputList);
        System.out.println(evenIntegers);
    }
}

