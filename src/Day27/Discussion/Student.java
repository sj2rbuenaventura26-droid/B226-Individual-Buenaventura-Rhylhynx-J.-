
package Day27.Discussion;

// Polymorphism, Inheritance , Abstraction, Encapsulation

// Model ()

public class Student {
    
  private  int id;
  private String name; 
  private  int age;
  private String course;
  private  String yearLevel;
    
    public Student (int id, String name, int age, String course, String yearLevel) {
       this.id = id;
        this.name = name;
        this.course = course;
        this.yearLevel = yearLevel;
        this.age = age;
        
    }
    
    public void setName(String name) {
        
}
    
    public void setAge(int age) {
        
    }
    
    public void setCourse(String course) {
        
    }
    
    public void setYearLevel (String yearLevel) {
        
    }
    
    public void setId (int id) {
        
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
       return id; 
    }
    
    public String getCourse() {
        return course;
    }
    
    public int getAge() {
       return age; 
    }
    
    public String  getYearLevel() {
        return yearLevel;
    }
    
    // 
    
    @Override
    public String toString() {
        return id + " - " + name + " (" + course + ", " + yearLevel + ")";
    }
    
    
    
}