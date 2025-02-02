
class cylinder{
    private int radious;
    public int getradious() {
        return radious;
    }
    public void setradious(int radious){
        this.radious = radious;
    }

    private int height;
    public int getheight(){
        return height;
    }
    public void setheight(int height){
        this.height = height;
    }
    public double surfaceArea(){
        double surarea = 2 * 3.142 * radious *radious + 2 * 3.14* radious * height;
        return surarea;
    }
    public double volume(){
        double surarea = 2 * 3.142 * radious * radious * height;
        return surarea;
    }
}




public class constructorpra {
        public static void main(String[] args){


             
            cylinder mycylinder = new cylinder();
            /* 
            mycylinder.setheight(12);
            
            System.out.println(mycylinder.getheight());
            mycylinder.setradious(9);

            System.out.println(mycylinder.getradious());
            */
            System.out.println(mycylinder.surfaceArea());
            // System.out.println(mycxylinder.surfaceArea());

            // problem 2
            



        }
}
