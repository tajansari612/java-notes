
import java.util.*;
import java.util.function.Consumer;

class _10_ForEachLoop {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,8,5,6,3,4);
        for(Integer e: l1) System.out.print(e+" ");
        System.out.println();

        //for each loop using annonymous inner class
        Consumer<Integer> consumer1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer+" ");
            }
        };System.out.println();
        l1.forEach(consumer1);

        //for each loop using lambda expression
        Consumer<Integer> consumer2 = (integer) -> {
            System.out.print(integer+" ");
        };System.out.println();
        l1.forEach(consumer2);

        //reducing forEach loop to single line
        l1.forEach((integer) -> System.out.print(integer+" "));
        System.out.println();

        l1.forEach((e) -> System.out.print(e*2+" "));
        System.out.println();
    }
}