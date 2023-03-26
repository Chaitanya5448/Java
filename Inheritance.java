public class Inheritance {
    public static void main(String[] args) {
        katana f1 = new katana();
        f1.swims();
    }
}
// CLASS FISH IS PARENT CLASS
class Fish{
    String name;
    int weight;
    int fins;

    void swims(){
        System.out.println("swims");
    }

    void breathes(){
        System.out.println("Breathes");
    }
}
// CLASS KATANA IS DERIVED CLASS AND HAS ALL FUNCTIONS OF CLASS FISH
class katana extends Fish{
    void eats(){
        System.out.println("eats");
    }
}