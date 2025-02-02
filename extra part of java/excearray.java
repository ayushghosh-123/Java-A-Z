public class excearray {
    public static void main(String[] args){
       // practice problem 1
      /*  float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
       float sum = 0;

       for(float element:marks){
         sum = sum + element;
       }
       System.err.println("The value of sum is"+ sum); */

       /* practice problem 2
       float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
       float num = 63.4f;
       boolean isInarray = false;

       for(float element:marks){
        if (num == element){
             isInarray = true;
             break;
        }
         
       }
       if(isInarray){
         System.out.println("The value is present in the array");
       }
       else{
        System.out.println("The value is present in the array");
       }
       */

       float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
       float sum = 0;

       for(float element:marks){
         sum = sum + element;
       }
       System.err.println("The value of sum is"+ sum/marks.length);

    }
}
