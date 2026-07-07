
package Day17.Activity;


public class AnotherMain {
    public static void main(String[] args) {
       
        CupOfCoffee cupofcoffee = new CupOfCoffee();
        cupofcoffee.brand = "Kopiko";
        cupofcoffee.color = "Brown";
        cupofcoffee.weight = 30f;
        cupofcoffee.flavor = "Brown";
        cupofcoffee.drink();
        cupofcoffee.drop();
        System.out.println("\nBrand: " + cupofcoffee.brand);
        System.out.println("\nColor: " + cupofcoffee.color);
        System.out.println("\nWeight:" + cupofcoffee.weight );
        System.out.println("\nFlavor: " + cupofcoffee.flavor);
        
        CupOfCoffee cupofcoffee2 = new CupOfCoffee();
        cupofcoffee2.brand = "Nescafe";
        cupofcoffee2.color = "Black";
        cupofcoffee2.flavor = "Black";
        cupofcoffee2.weight = 32f;
        cupofcoffee2.drink();
        cupofcoffee2.drop();
        System.out.println("\nBrand: " + cupofcoffee2.brand);
        System.out.println("\nColor: " + cupofcoffee2.color);
        System.out.println("\nFlavor: " + cupofcoffee2.flavor);
        System.out.println("\nWeight: " + cupofcoffee2.weight);
        
        CupOfCoffee cupofcoffee3 = new CupOfCoffee();
        cupofcoffee3.brand = "Greatest";
        cupofcoffee3.color = "White";
        cupofcoffee3.flavor = "White";
        cupofcoffee3.weight = 35f; 
        cupofcoffee3.drink();
        cupofcoffee3.drop();
        System.out.println("\nBrand: " + cupofcoffee3.brand);
        System.out.println("\nColor: " + cupofcoffee3.color);
        System.out.println("\nFlavor: " + cupofcoffee3.flavor);
        System.out.println("\nWeight: " + cupofcoffee3.weight );
        
        
            
        
    }
}
