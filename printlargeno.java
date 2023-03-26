import java.util.Scanner;

public class printlargeno {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b){
                System.out.println("A is greater than B");
            }
            else{
                System.out.println("B is greater than A");
            }
        }
    }
}
