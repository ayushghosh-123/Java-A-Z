

// java dose not support multiple inheritance 
interface camera{
    void takesnap();
    void recordvideo();
    default void record4kvideo(){
        System.out.println("Recording in 4k... ");
    }
}

interface wifi{
    String[] getNetwork();
    void connecttonetwork(String network);
}

class mycellphone{
     
    void callnumber(int phonenumber){
        System.out.println("Calling"+ phonenumber);
    }
    void pickcall(){
        System.out.println("connecting.....");
    }
}

class smartphone extends mycellphone implements wifi,camera {
   public void takesnap(){
        System.out.println("taking a snap......");
    }
    public void recordvideo(){
        System.out.println("keep recoded the voice note.....");
    }
    public void record4kvideo(){
        System.out.println("Taking snap and recordced in 4k .....");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of network");
        String[] network= {"Harry","Preshnat","Anjali"};
        return network;
    }
}
public class interface2 {
    public static void main(String[] args) {
        smartphone ms = new smartphone();
        String[] ar = ms.getNetworks();
        for(String item:ar){
            System.out.println(item);
        }
    }
}
