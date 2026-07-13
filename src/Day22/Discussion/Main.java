
package Day22.Discussion;

public class Main {
    public static void main(String[] args) {
      
        Admin admin = new Admin("Winter", "winter@gmail.com", "winter123","Admin");
        System.out.println(admin.getRoleInfo()); 
        
        StandardUser user = new StandardUser("Summer","summer@gmail.com", "summer123","Standard User");
        System.out.println(user.getRoleInfo()); 
        
         System.out.println("Company Name: " + user.getCompanyName());
         
        SuperAdmin superAdmin = new SuperAdmin("Fall", "fall@gmail.com", "fall", "Standard User");
        superAdmin.getRoleInfo();
        
    }  
}
