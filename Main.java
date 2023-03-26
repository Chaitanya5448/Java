public class Main {
    public static void main(String args[]){
        //Creation of Object.
        //Object Object_name = new Object();
        student s1 = new student();
        //object_name.Function_name(values of arguments);
        s1.calaverage(85, 96, 98);
        //syso (object_name.funation madhle declare kelela var= formula aahe na toh);
        System.out.println(s1.average);
    }

}
//class the Student is Object
class student{
    //this are properties
    String name ;
    int rollno;
    int average;
    //this are function of it
    void calaverage(int p, int c, int m){
        average = (p+c+m)/3;
    }
}
