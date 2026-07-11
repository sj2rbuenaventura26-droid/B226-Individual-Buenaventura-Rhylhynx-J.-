
package Day21.Discussion;


public class Ballpen {
     
     // this -> refers to the current class object
    // data hiding -> making all the data members privata
    // data validation use setter and getter methods
    
    // private fields / members
    private int id; 
    private String brand;
    private String color;
    private double price;
    private  double pointSize;
    
    // default constructor
   // parameterized constructor  / setter constructor 
    public Ballpen(String brand, String color, double price, double pointSize) {
     this.brand = brand;
     this.color = color;
     this.pointSize = pointSize;
     this.price = price;


    //System.out.println("The ballpen is created...");
    }


    // conventional / unconventional 
    // setter / mutator method
    
    public void setBrand(String brand){
        this.brand = brand; 
    }
    
    public void setColor(String color) {
        this.color = color;
    }
     
     public void setPrice (double price) {
         this.price = price;
     }
     
      public void setPointSize(double PointSize) {
          this.pointSize =  PointSize;
      }
      
      public void setID(int ID) {
          this.id = ID;
      }
    // getter / accesor  method 
    
    public String getBrand() {
         return brand;
    }
    
    public String getColor() { 
         return color;
    }
    
    public double getPrice() {
        return price;
    }
    
    public double getPointSize() {
        return pointSize;
    }
    
    public double getID() {
        return id;  
    }
}
