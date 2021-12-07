package C_classobject;
class Test{
    private int no;
    private String name;

    Test(){
    no=10;
    name="rahul";
    }
    void display(){
        System.out.println("Constructor is called");
        System.out.println("No is :"+no+" Name is :"+name);
    }
}
public class ConstructorClass {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}
