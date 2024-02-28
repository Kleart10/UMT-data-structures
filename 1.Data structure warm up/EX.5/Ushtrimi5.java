package Seminar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ushtrimi5 {
    public static List<Integer> findLongestConsecutiveSubsequence(List<Integer> inputList) {
        Set<Integer> numSet = new HashSet<>(inputList);
        int maxLength = 0;
        int currentLength = 0;
        int startNum = 0;
        int currentNum = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                currentLength = 1;
                currentNum = num;

                while (numSet.contains(currentNum + 1)) {
                    currentLength++;
                    currentNum++;
                }

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startNum = num;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < maxLength; i++) {
            result.add(startNum + i);
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(3, 2, 3, 5, 4, 8, 9, 10);
        List<Integer> longestConsecutiveSubsequence = findLongestConsecutiveSubsequence(inputList);
        System.out.println(longestConsecutiveSubsequence);
    }
}
