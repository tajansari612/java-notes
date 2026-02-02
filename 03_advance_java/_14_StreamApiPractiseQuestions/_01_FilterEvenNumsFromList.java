import java.util.*;

public class _01_FilterEvenNumsFromList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,5,1,9,2,4,6,7,8);
        List<Integer> evenNums = nums.stream().filter((e) -> (e%2==0)).toList();
        evenNums.forEach(e -> System.out.print(e+" "));
    }
}