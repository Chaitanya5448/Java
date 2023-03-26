import java.util.Scanner;

public class CallByValue {

    public static void Swap(int a,int b){
        int temp=a;
            a=b;
            b=temp;

            System.out.println("A is :" + a);
            System.out.println("B is :" + b);
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A : ");
            int a = sc.nextInt();
            System.out.print("Enter B : ");
            int b = sc.nextInt();

            Swap(a, b);
        }
    }
}
