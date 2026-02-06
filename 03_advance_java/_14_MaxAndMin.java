import java.util.*;

public class _14_MaxAndMin {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,5,1,9,2,4,6,47,8);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // Even numbers > Odd numbers
                if (o1 % 2 == 0 && o2 % 2 != 0) return 1;
                if (o1 % 2 != 0 && o2 % 2 == 0) return -1;

                // If both are even or both are odd, compare normally
                return Integer.compare(o1, o2);
            }
        };

        Comparator<Integer> comparator2 = (o1, o2) -> {
            // Even numbers > Odd numbers
                if (o1 % 2 == 0 && o2 % 2 != 0) return 1;
                if (o1 % 2 != 0 && o2 % 2 == 0) return -1;

                // If both are even or both are odd, compare normally
                return Integer.compare(o1, o2);
        };


        // Optional<Integer> maxe = nums.stream().max(comparator);

        // Optional<Integer> maxe = nums.stream().max(comparator2);

        Optional<Integer> maxe = nums.stream().max(Integer::compare);
        System.out.println(maxe.get());

        List<String> fruits = Arrays.asList("Banana", "Cherry", "Mango", "Blueberry");

        Optional<String> maxFruit = fruits.stream().max(Comparator.naturalOrder());  //alphabetical
        System.out.println(maxFruit.get());

        Optional<String> maxLenFruit = fruits.stream().max(Comparator.comparingInt(String::length)); //Length
        System.out.println(maxLenFruit.get());


        int mine = nums.stream().min(Integer::compare).get();
        System.out.println(mine);

    }
}
