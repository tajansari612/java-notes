import java.util.*;

public class _03_SortAList{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(6,5,7,3,4,2,9,1);

        // Collections.sort(nums);
        System.out.println(nums);

        //using stream
        List<Integer> sortedNums = nums.stream().sorted().toList();
        System.out.println(sortedNums);

        //Desc
        List<Integer> sortedNumsDesc = nums.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedNumsDesc);

        //String
        List<String> fruits = Arrays.asList("Banana", "Cherry", "Mango", "Blueberry");
        List<String> sorteFruits = fruits.stream().sorted().toList();
        System.out.println(sorteFruits);

        //Size
        List<String> sortedFruitsLen = fruits.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(sortedFruitsLen);


    }
}