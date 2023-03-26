public class Constructors {
    public static void main(String[] args) {
        // Chaitanya() is a constructors which is constructing new object
        Chaitanya T1 = new Chaitanya("BE");
        System.out.println(T1.education);
    }
}
class Chaitanya{

    String name;
    int height;
    int age;
    String education;

    // Class la intialize karyasathi function/Constructor banyache
    //arguments takun instialize kele
    Chaitanya(String education){
       this.education = education;
    }
}
