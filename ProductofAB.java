import java.util.Scanner;

public class ProductofAB {

    public static void Product(int a,int b){
         int multiple = a*b;
         System.out.println("Product of A & B is :- " + multiple);
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A : ");
            int a = sc.nextInt();
            System.out.print("Enter B : ");
            int b = sc.nextInt();

            Product(a, b);
        }
    }
}
