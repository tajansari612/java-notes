import java.util.*;

class _02_FindMaxNumInList{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,5,1,9,2,4,6,7,8);

        //Using resuce
        int maxe = nums.stream().reduce(0,(e, acc) -> {
            if(e>acc) acc=e;
            return acc;
        }).intValue();

        System.out.println(maxe);

        //using stream().max()
        maxe=0;
        maxe = nums.stream().max(Integer::compare).get();
        System.out.println(maxe);
    }
}