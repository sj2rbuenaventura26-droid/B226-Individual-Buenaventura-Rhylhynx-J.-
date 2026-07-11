
package Day21.Activity;


public class UserAccount {
    private String firstName;
    private String lastName;
    private String middleName;
    private String address;
    private String email;
    private String password;
    
   public UserAccount(String firstName, String lastName, String middleName, String address , String email, String password) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.middleName = middleName;    
       this.address  = address;
       this.email = email;
       this.password = password;
    
   }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName; 
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setEmail(String email) {
         if  (email.contains("@") && email.contains(".")) {
             this.email = email;
         } else {
             System.out.println("Invalid Email!");
             this.email = "Invalid";
         }
    }
    
    public void setPassword (String password) {
        if (password.length() <=8) {
            this.password = password;
        } else {
            System.out.println("Invalid Password!");
            this.password = "Invalid";
        }
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName; 
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getMiddleName() {
        return middleName;  
    }
    
    public String getAddress() {
        return address;                  
    }
     
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
           return  password;  
    }
    
    
    
     
   
     
 }    
                          
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                