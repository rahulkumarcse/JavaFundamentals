package A_basics;

public class JavaVariables {
    int a=1; //instance variable
    static int c= 2; //static variable
    void printi(){
         c =3;
        System.out.println(c);

    }

    public static void main(String[] args) {
        int b=4;
        //int a =5;
        new JavaVariables().printi();
        System.out.println("Instance variable a:"+new JavaVariables().a+" Static variable c :"+c+" local variable :"+b);




    }
}
