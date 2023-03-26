import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int Number = sc.nextInt();

            switch (Number) {
                case 1 : System.out.println("What's Up man !");
                         break;
                case 2 : System.out.println("Hello ...");
                         break;
                case 3 : System.out.println("Kay Mitra Kasa Aahes !");
                         break;
                default: System.out.println("Namaste");
                    break;
            }
        }
    }
}
