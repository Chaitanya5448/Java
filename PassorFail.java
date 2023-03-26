import java.util.Scanner;

public class PassorFail {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int marks = sc.nextInt();

            String type = (marks>35) ? "Pass" : "Fail";
            System.out.println(type);
        }
    }
}
