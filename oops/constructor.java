
class mymainemploye{
    private int Id;
    private String name;

    public mymainemploye(){
        Id = 7;
        name = "your-name";
    }
    public mymainemploye(String myname, int idt){
        Id = idt;
        name = myname;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
       this. name = n;
    }
    public void setId(int i){
       this. Id = i;
    }
    public int getId(){
        return Id;
    }
   
}


public class constructor {
    public static void main(String[] args) {
        // mymainemploye ayu = new mymainemploye("Ayush",45);
        mymainemploye ayu = new mymainemploye();
        // ayu.setName("ayush");
        // ayu.setId(45);
        System.out.println(ayu.getId());
        System.out.println(ayu.getName());


    }
}
