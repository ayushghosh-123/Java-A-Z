package bank;

class account{
    public String name;
    protected String email;
    private String password;

    // getters & setter
    public String  getpassword() {
        return this.password;
    } 
    public void setpassword(String pass){
        this.password = "pass";
    }
}
public class bank {
     public static void main(String args[]) {
        account account1 = new account();
        account1.name =  "Apna Collage";
        account1.email = "apnacollage@gmail.com";
        account1.setpassword("abcd");
        System.out.println(account1.getpassword());
     }
} 

  