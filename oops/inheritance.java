
class base{ //base class, super class, parent class 
    int x;

    public int getX(){
        return x ;
    }

    public void setX(int x){
        this.x = x; 
    }
    void printme(){ // derived class, child class
        System.out.println("I am a constructor");
    }
}
class derived extends base{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    
}
public class inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());

        derived y = new derived();
        y.setX(4);
        System.out.println(y.getX());

        derived z = new derived();
        z.setY(43);
        System.out.println(z.getY());
    }
}
