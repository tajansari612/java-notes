import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class _12_MapAndFilter {
    public static void main(String[] args){
        List<Integer> l1 = Arrays.asList(1,5,8,6,3,4,9);
        l1.forEach(e -> System.out.print(e+" "));
        System.out.println();

        //Filter
        //1
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer%2==0) return true;
                return false;
            }
        };
        List<Integer> l2 = l1.stream().filter(predicate).toList();
        l2.forEach(e -> System.out.print(e+" "));
        System.out.println();

        //2
        Predicate<Integer> predicate1 = (integer) -> integer%2==0?true:false;
        List<Integer> l3 = l1.stream().filter(predicate1).toList();
        l3.forEach(e -> System.out.print(e+" "));
        System.out.println();

        //3
        List<Integer> l4 = l1.stream().filter( e -> e%2==0?true:false).toList();
        l4.forEach(e -> System.out.print(e+" "));
        System.out.println();

        //4
        List<Integer> l5 = l1.stream().filter( e -> e%2==0).toList();
        l4.forEach(e -> System.out.print(e+" "));
        System.out.println();


        //Map
        //1
        Function<Integer,Integer> mapper = new Function<>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };
        List<Integer> l6 = l1.stream().map(mapper).toList();
        l6.forEach(e -> System.out.print(e+" "));
        System.out.println();

        //2
        Function<Integer, Integer> mapper1 = integer -> integer*3;
        List<Integer> l7 = l1.stream().map(mapper1).toList();
        l7.forEach(e -> System.out.print(e+" "));
        System.out.println();

        //3
        List<Integer> l8 = l1.stream().map(e -> e+1).toList();
        l8.forEach(e -> System.out.print(e+" "));
        System.out.println();
    }
}
