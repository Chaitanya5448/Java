public class AbstractClass {
    public static void main(String[] args) {
        sharaddha s1 = new sharaddha();
        s1.smile();

        // cannot create Aman wala object;
    }
}

abstract class Aman{
    void teaches(){
        System.out.println("Aman Bhaiya Teaches");
    }
    // here just idea implementation in other class
    abstract void smile();
}

class sharaddha extends Aman{
    void smile(){
        System.out.println("heheheheee");
    } 
}