
package Day22.Discussion;

public class Admin extends User {
    String deptName;
    
    public Admin (String name, String email, String password, String userRole) {
        super (name,email, password, userRole);
        this.deptName = deptName;
    }
    
   
}
