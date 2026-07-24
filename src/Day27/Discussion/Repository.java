
package Day27.Discussion;

import java.util.List;
import java.util.ArrayList;

public class Repository {
    public List<Student> getAllStudents () {
        List<Student> students = new ArrayList<>();

        students.add(new Student (1, "Jerry Matubis", 12,"BSIT","5th"));
        students.add(new Student (2, "Annie Batungbakal", 19,"BSIT","4th"));
        
        return students;
        
        
    }
}
