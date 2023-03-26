public class TernaryOpt {
    public static void main(String args[]){
        int number = 9;

        String type = ((number%2) == 0) ? "Even" : "Odd";
        System.out.println(type);
    }
}
