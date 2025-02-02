
class myemploye{
    private int Id;
    private String name;

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

public class accessmodifier {
    public static void main(String[] args) {
        
        myemploye y = new myemploye();
        // y.id = 49;
        // y.name = "Ayush"; ---> throws an error due to private acess modifier
        y.setName("Ayush Ghosh");
        System.out.println(y.getName());
        y.setId(45600);
        System.out.println(y.getId());

    }
}
