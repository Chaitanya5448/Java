import java.util.Scanner;

public class sumofnNat {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;
            int i =1;
            while (i<=n) {
                sum = sum+i;
                i++;
            }
            System.out.println("The Sum is :-" + sum);
        }
    }
}
