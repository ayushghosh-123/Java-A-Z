
class phone{
    public void showTime(){
        System.out.println("Time is 8 a.m");
    }
    public void on(){
        System.out.println("Turning on phone.....");
    }
}
class Smartphone extends phone{
    public void showTime(){
        System.out.println("time is 9 p.m");
    }
    public void on(){
        System.out.println("Turning on Smartphone.....");
    }
    public void playmusic(){
        System.out.println("Turning on  music Smartphone.......");
    }
}
public class dynamicmethoddispatch {
    public static void main(String[] args) {
        // one obj = new one();//alow it
        // two o = new two();//alow it
        // obj.name();

        phone obj = new Smartphone();//yes it is allowed

        obj.showTime();
        obj.on();
        
        

        // two obj2 = new one();//not possible
    }
}
