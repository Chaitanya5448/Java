import java.util.Scanner;

public class Param {

    public static void printsum(int a,int b){
        int sum = a+b;
        System.out.println("Sum is :" + sum );
    }
    public static void main(String args[]){
           try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
               int b = sc.nextInt();
               printsum(a, b);
        }
    }
}
