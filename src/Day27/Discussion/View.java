
package Day27.Discussion;

import java.util.ArrayList;
import java.util.List;

public class View {
    
    public void displayAllStudents() {
        Repository repo = new Repository();
        
        List<Student> studentList = repo.getAllStudents();
        
        // iterate and display
        
        for (Student stud: studentList) {
            System.out.println(stud);
        }
    }
    
    
}
  // List<Student> students = new ArrayList<>();