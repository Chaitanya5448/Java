import java.util.Scanner;

public class Largeof3 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>b && a>c){
                System.out.println("A is Greater than all of 3 ");
            }
            else if(b>a && b>c){
                System.out.println("B is Greater than all of 3 ");
            }
            else{
                System.out.println("C is Greater than all of 3 ");
            }
        }
    }
}
