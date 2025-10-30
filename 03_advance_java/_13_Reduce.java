import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class _13_Reduce {
    public static void main(String[] args){
        //Reduce
        List<Integer> l1 = Arrays.asList(6,2,9,1,4,5,8,2);

        //1
        int identity = 0;  //for accumulato initialization
        BinaryOperator<Integer> accumulator  = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+=integer2;
            }
        };
        int sum = l1.stream().reduce(identity,accumulator).intValue();
        System.out.println(sum);

        //2
        BinaryOperator<Integer> accumulator2 = (Integer acc, Integer e) -> acc+=e;
        int sum2 = l1.stream().reduce(0,accumulator2).intValue();
        System.out.println(sum2);

        //3 identity is optional
        Integer sum3 = l1.stream().reduce((acc,e) -> acc+=e).get();
        System.out.println(sum3);
    }
}
