public class CopyConstructors{
    public static void main(String[] args) {
        //FIRST CONSTRUCTORS
        student s1 = new student();
        s1.name = "Chaitanya";
        s1.age = 19;
        //SECOND CONSTRUCTORS WHICH HAS COPIED THE FUNCTION/PROP OF FIRST 
        student s2 = new student();
        s2.weight = 73;

    }
}
class student{
    String name;
    int age;
    int weight;
}