import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ushtrimi1 {
    public static List<String> findUnique(List<String> inputList) {
        Set<String> uniqueSet = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (String str : inputList) {
            if (uniqueSet.add(str)) {
                result.add(str);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> inputList = List.of("apple", "orange", "banana", "apple", "kiwi", "banana");
        List<String> uniqueStrings = findUnique(inputList);
        System.out.println(uniqueStrings);
    }
}
