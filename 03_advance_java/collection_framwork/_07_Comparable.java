import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Student implements Comparable<Student>{
    private String name;
    private int rollNo;
    private int age;

    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + ", age=" + age + "]";
    }


    @Override
    public int compareTo(Student that){
        return this.getAge()>that.getAge()?1:-1;
    }

    
}

public class _07_Comparable {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Taj", 5, 25));
        studentsList.add(new Student("Ayaj", 6, 23));
        studentsList.add(new Student("Kunal", 2, 21));
        studentsList.add(new Student("Rohit", 1, 22));
        studentsList.add(new Student("Tanya", 3, 24));
        studentsList.add(new Student("Divya", 4, 23));

        for(Student s: studentsList){
           System.out.println( s.toString());
        }System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

        // Collections.sort(studentsList);  //error we have implement comparable

        //using comparator
        Comparator<Student> studComp = new Comparator<>(){
            public int compare(Student i, Student j){
                if(i.getAge() > j.getAge()) return 1;
                else return -1;
            }
        };

        Collections.sort(studentsList, studComp);

        for(Student s: studentsList){
            System.out.println(s.toString());
        }System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

        
        //Converting to lambda expression
        Comparator<Student> studComp2 = (i,j) -> i.getRollNo()>j.getRollNo()?1:-1;
        Collections.sort(studentsList, studComp2);
        for(Student s: studentsList){
            System.out.println(s.toString());
        }System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        //using comparable
        Collections.sort(studentsList);
        for(Student s: studentsList){
            System.out.println(s+" ");
        }
    }
}
