public class multidimensionarray {
   public static void main(String args[]){
      //  int []  marks;
       int [][] flats;
       flats = new int [2][3];
       flats[0][0] = 101;      
       flats[0][1] = 102;      
       flats[0][2] = 103;      
       flats[1][0] = 201;      
       flats[1][0] = 202;      
       flats[1][0] = 203; 
       
      //  Display the 2-d array (for loop)
      System.out.println("Printing a 2-D array using for loop");
      for(int i=0; i<flats.length; i++){
         for(int j=0; j<flats.length; j++){
            System.err.print(flats[i]);
            System.err.print("");
         }
         System.out.print("  ");
      }

   } 
}
