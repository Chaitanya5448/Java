import java.util.Scanner;

public class BreakQ {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            do{
                System.out.print("Enter the Number :");
                int n = sc.nextInt();

                if(n % 10 == 0){
                    break;
                }
                System.out.println(n);
            }while(true);
            System.out.println("I am out in Loop !");
        }
    }
}
