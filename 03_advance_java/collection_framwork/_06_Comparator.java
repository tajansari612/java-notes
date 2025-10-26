
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class _06_Comparator{
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(77);
        l1.add(39);
        l1.add(92);
        l1.add(28);
        l1.add(61);
        l1.add(16);

        // Sorting
        Collections.sort(l1);
        for(int e : l1){
            System.out.print(e+" ");
        }System.out.println();

        // Sorting using comparator for customized sorting
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i<j) return 1;
                else return -1;
            }
        };
        Collections.sort(l1, comp);
        for(int e : l1){
            System.out.print(e+" ");
        }System.out.println();

        //For strings
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Taj");
        l2.add("Kunal");
        l2.add("Sameera");
        l2.add("Rocky");
        l2.add("Ram Pothineny");
        l2.add("Salman Khan");
        l2.add("Rohit");
        l2.add("Tu");
        l2.add("I");

        for(String e: l2){
            System.out.print(e+" | ");
        }System.out.println();

        //Collections.sort()  alphabetical sort
        Collections.sort(l2);
        for(String e: l2){
            System.out.print(e+" | ");
        }System.out.println();


        //Custom sort
        Comparator<String> comp2 = new Comparator<String>() {
            public int compare(String s1, String s2){
                if(s1.length()>s2.length()) return 1;
                else return -1;
            }
        };
        Collections.sort(l2, comp2);
        for(String e: l2){
            System.out.print(e+" | ");
        }System.out.println();


    }
}