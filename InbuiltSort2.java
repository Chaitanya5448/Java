import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort2 {

    // Function to print Array
    public static void PrintArray(Integer array[]){
        int n = array.length;
        for(Integer i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr,Collections.reverseOrder());
        PrintArray(arr);
    }
}
