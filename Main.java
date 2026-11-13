import java.util.ArrayList;
import java.util.Collections;
public class Main {


    static void main() {
        ArrayList<Student> s1=new ArrayList<>();
        s1.add(new Student());
        s1.add(new Student(3.0,20,"Hadi"));
        s1.add(new Student(4.0,20,"Ali"));
        s1.add(new Student(3.5, 20, "Hadi"));
        s1.add(new Student(1.5, 21, "ndem"));
        s1.add(new Student(3.5, 22, "Ali"));
        System.out.println("Before sorting:");
        System.out.print(s1);
        Collections.sort(s1);
        System.out.println("After sorting:");
        System.out.println(s1);
        for (Student s : s1) {
            if (s.isOnProbation()) {
                System.out.println(s.getNamee());
            }
        }

    }
}
