import java.util.*;

public class Syntax2Darrays {
    public static void main(String args[]){
      int matrix[][] = new int [3][4];
      // int row = matrix.length & int col = matrix[0].length
      int row = 3;
      int col = 4;
      try (Scanner sc = new Scanner (System.in)) {
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
          }
          // Output
          for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
          }
        }
    }
}
