
package Day22.Discussion;

    


public class User {
   
    String name;
    String email;
    String password;
    String userRole;
  
    // alt + insert
    
    
  public User(String name, String email, String password, String userRole) {
       this.name = name;
       this.email = email;
       this.password = password;
       this.userRole = userRole;
 
    
}
  
  public String getRoleInfo() {
      return "User" + name + ", User Role: " + userRole; 
  }
 


    
    
    
}
