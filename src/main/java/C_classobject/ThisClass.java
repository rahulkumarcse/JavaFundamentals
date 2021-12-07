package C_classobject;

public class ThisClass {
    int a=8;
    int b;
    ThisClass(){
        System.out.println("Default Constructor called");
    }

    ThisClass(int a)
    {
        this();
        this.b=a;
        System.out.println("This constructor is called with second val : "+this.a);
    }

    public static void main(String[] args) {
         new ThisClass(9);

    }
}
