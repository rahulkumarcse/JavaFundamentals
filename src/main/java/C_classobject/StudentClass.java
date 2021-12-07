package C_classobject;

public class StudentClass {
    int roll;
    String name;
    void printDetails(){
        System.out.println("Roll No is :"+roll+" Name is :"+name);
    }
    public static void main(String[] args) {
        StudentClass studentClass = new StudentClass();
        studentClass.name="Rahul";
        studentClass.roll=12;
        studentClass.printDetails();

    }
}
