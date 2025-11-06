public class constructor_11 {
    String name;
    int age;
    constructor_11(){
        System.out.println("Default constructor");
    }
    constructor_11(String name,int age){
        System.out.println("Parameterized constructor");
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name+" -> "+age);
    }
    public static void main(String [] args){
        constructor_11 cons1=new constructor_11();
        cons1.display();
        constructor_11 cons2=new constructor_11("Ajay",21);
        cons2.display();
    }
}
