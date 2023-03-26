import java.util.Scanner;

public class IncomeTax {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if(n<=500000){
                System.out.println("Your Income Tax is 0%");
            }
            else if(n<=1000000){
                System.out.println("Your Income Tax is 20% of your income");
            }
            else{
                System.out.println("Your Income Tax is 50% of your Income");
            }
        }
    }
}
