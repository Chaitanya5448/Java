public class TypesofConstructors {
    public static void main(String[] args) {
        student s1 = new student("Chaitanya");
        System.out.println(s1.name);
    }
}
class student{
    String name;
    int age;
    int standard;

    // NON-PARAMETERIZED CONSTRUCTORS = CONSTRUCTORS WHICH DO NOT HAVE PARAMETERS
    /* student(){
        System.out.println("hi");
    } */

    // PARAMETERIZED CONSTRUCTORS = CONSTRUCTORS WHICH DO HAVE PARAMETER
    student(String name){
       this.name = name;
    }
 }
