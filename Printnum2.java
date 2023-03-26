import java.util.Scanner;

public class Printnum2 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Upto how many digits you have print :-");
            int n = sc.nextInt();
            int range = 1;
            while (range<=n) {
                System.out.println(range);
                range++;
            }
        }
    }
}
