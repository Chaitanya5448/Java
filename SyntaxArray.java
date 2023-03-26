import java.util.*;

public class SyntaxArray {
    public static void main(String args[]){
        // Creating array.
        int marks[] = new int[50];
        try (//  Input.
        Scanner sc = new Scanner(System.in)) {
            // Storing inputed values in array.
            marks[0] = sc.nextInt();
            marks[1] = sc.nextInt();
            marks[2] = sc.nextInt();
        }
        //  Output.
        System.out.println("Physics marks are : " + marks[0]);
        System.out.println("Chemistry marks are : " + marks[1]);
        System.out.println("Maths marks are : " + marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage is : " + percentage + "%");
    }
}
