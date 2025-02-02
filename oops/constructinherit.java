
class base1{ //base class, super class, parent class 

    base1(){
        System.out.println("i am a constructor");
    }
    base1(int x){
        System.out.println("I am an overloaded constructoor with value of x as: "+ x);
    }
    public int x;
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

class derived1 extends base1{
    derived1(){
        // super(0);
        System.out.println("i am the constructor of derived class");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("i am the overloaded constructor with value of y as: "+ y);
    }

    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}

class childofderived extends derived1{
    childofderived(){
        System.out.println("I am a child of derived constructor");
    }
    childofderived(int x, int y, int z){
        super(4, 5);
        System.out.println("i am the overloaded consteructor with value of z as: "+ z); 
      }

}

public class constructinherit {
    public static void main(String[] args) {
        // base1 b = new base1();
        // derived1 d = new derived1();  
        // derived1 d = new derived1(40, 9);  
        // childofderived cd = new childofderived();
        childofderived cd = new childofderived(21,25,24);
    }
}
