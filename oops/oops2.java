  package com.company;
// opps practice 1question;

class Employee1{
    int salary;
    String name;

    public int getsalary(){
            return salary;
    }
    public String getName(){
            return name;
    }
    public void setName(String n){
        name = n;
    }
}
class cellphone{
    public void ring(){
        System.out.println("Ring.....");
    }
    public void vibrate(){
        System.out.println("vibrating.....");
    }
    public void callfriend(){
        System.out.println("call Mukul.....");
    }
}
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class tomy{
    
}
public class oops2 {
    public static void main(String[] args){
       /* 
        // problem 1
        Employee1  ayush = new Employee1();
        ayush.setName("CodewithAyush");
        ayush.salary = 233;

        System.out.println(ayush.getName());
        System.out.println(ayush.getsalary());

        // problem 2
        cellphone asus = new cellphone();
        asus.callfriend();
        asus.vibrate();
        asus.ring();
        */

       /*  // problem 3
        square sq = new square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        */

    }
}
