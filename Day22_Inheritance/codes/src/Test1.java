
class Person{

    String name;
    int age;
    String gender;
    float height;

    Person(String name, int age, String gender, float height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public void dispDetails(){
        System.out.println("NAME   :: "+ name);
        System.out.println("AGE    :: "+ age);
        System.out.println("GENDER :: " + gender);
        System.out.println("HEIGHT :: "+height);
    }

}

class Student extends Person{

    String sid;
    int marks;

    //Parameterized constructor : Shadowing
    Student(String name,int age,String gender,float height,String sid,int marks){
        super(name,age,gender,height);
        this.sid = sid;
        this.marks = marks;
    }

    public void dispDetails(){
        super.dispDetails();//To call parent class dispDetails() we used super keyword
        System.out.println("SID   :: "+ sid);
        System.out.println("MARKS :: " + marks);  
    }
}
public class Test1 {
    public static void main(String[] args) {
         Student std = new Student("Sachin",23,"M",4.9f,"IND10",85);
         std.dispDetails();
    }
}
