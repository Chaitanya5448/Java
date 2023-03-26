public class Static {
    public static void main(String[] args) {
       Store s1 = new Store();
       s1.Storename = "ABC"; 

       Store s2 = new Store();
       System.out.println(s2.Storename);
    }
}

class Store{
    String adress;
    int num;

    //Static
     String Storename;
}