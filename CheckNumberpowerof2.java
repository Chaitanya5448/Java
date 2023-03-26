public class CheckNumberpowerof2 {

    public static boolean Checkix(int n){
       return (n&(n-1)) == 0;
    }
    public static void main(String args[]){
        System.out.println(Checkix(4));
    }
}
