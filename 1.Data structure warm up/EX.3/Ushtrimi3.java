package Seminar;

import java.util.Arrays;
import java.util.List;

public class Ushtrimi3 {
    public static int findKthSmallest(List<Integer> inputList, int k) {
        Integer[] array = inputList.toArray(new Integer[0]);
        Arrays.sort(array);
        
        return array[k - 1];
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(5, 2, 9, 1, 7, 6);
        int k = 3;
        int kthSmallest = findKthSmallest(inputList, k);
        System.out.println("The " + k + "-th smallest integer is: " + kthSmallest);
    }
}
