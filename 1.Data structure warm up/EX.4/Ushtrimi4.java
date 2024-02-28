package Seminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ushtrimi4 {
    public static List<Integer> findLongestIncreasingSubsequence(List<Integer> inputList) {
        int n = inputList.size();
        List<Integer>[] lis = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            lis[i] = new ArrayList<>();
        }

        lis[0].add(inputList.get(0));

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (inputList.get(i) > inputList.get(j) && lis[i].size() < lis[j].size() + 1) {
                    lis[i] = new ArrayList<>(lis[j]);
                }
            }
            lis[i].add(inputList.get(i));
        }

        int maxLengthIndex = 0;
        for (int i = 1; i < n; i++) {
            if (lis[i].size() > lis[maxLengthIndex].size()) {
                maxLengthIndex = i;
            }
        }

        return lis[maxLengthIndex];
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 3, 2, 4, 3, 5, 4, 6);
        List<Integer> longestIncreasingSubsequence = findLongestIncreasingSubsequence(inputList);
        System.out.println(longestIncreasingSubsequence);
    }
}
