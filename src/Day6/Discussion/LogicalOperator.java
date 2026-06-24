
package Day6.Discussion;


public class LogicalOperator {
    public static void main(String[] args){
        // Cinema Logic 
        boolean hasTicket = true;
        boolean hasVaccinationCard = true;
        boolean isSeniorCitizen = true;
        boolean isStudent = true;
        boolean isLoggedIn = false;
        
        // (&&) May ticket -> pwede kang pumasok sa sinehan 
        System.out.println("Allowed to enter cinema: " + (hasTicket && hasVaccinationCard));
       
        // (||) May ticket (Student || senior citizen) -> Discounted
        System.out.println("Eligible for discount: " + (isStudent || isSeniorCitizen));
        
       // NOT(!) Hindi naka logged in sa app 
        System.out.println("Cannot Reserve Seat: " + !isLoggedIn);
        
        
               








        


        // Logical &&
        // int num = 100;
        // int num2 = 200;
        
        // boolean result = num < num2 && num > num2;
        // System.out.println(result);

        
        /*    &&           Result
        T     T           T   
        T     F           F
        F     T           F
        F     F           F
        */
        
        /*     ||          RESULT
                T    T      T
                T    F      T
                F    T      T
                F    F      F
        */
    }
}
