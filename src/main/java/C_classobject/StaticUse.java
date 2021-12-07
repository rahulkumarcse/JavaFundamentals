package C_classobject;

import java.util.Scanner;

public class StaticUse {
    static int x=1;
    int y;
    static int sum(int a,int b){
        return a+b;
    }
    static void set(int a, int b){
        int x=a;
        int y=b;
    }
     void increment(){
        x++;
    }
    void show(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        StaticUse staticUse1 = new StaticUse();
        StaticUse staticUse2=new StaticUse();
        Scanner sc = new Scanner(System.in);
        staticUse1.increment();
        staticUse2.increment();
        staticUse1.show();
    }
}
