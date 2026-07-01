
package Day12.Discussion;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // Syntax on how to declare a multi-dimensional array
        
        String[][]colors = {
            // 0       1       2
            {"white","pink","yellow"}, // 0
            {"black", "brown", "gray"},  // 1
            {"green"} // 2
               
        };
        
       // Cooordinates       [rows][columns]
     //   System.out.println(colors[0][1]);
        
       //  System.out.println(colors.length);
        
        // Traverse a multi-Dimensional array using nested for-loop
        
       //               0 < 3
     //   for (int i = 0; i < colors.length; i++) { // outer loop 
           //               0 < 3
       //     for (int j = 0; j < colors[i].length; j++) { // inner loop 
                //                        0  0
         //       System.out.println(colors[i][j]);
          //  }
        System.out.println(""); //new Line 
        
         // Printing a multi-Dimensional array using nested for each-loop
         for (String[] row : colors) {
             for (String column : row) {
                 System.out.println(column);    
             }
             System.out.println("");
         }
         
        
    }
}


 //String [][] planets = new String [rows][columns];
        