import java.util.Arrays;


public class InbuiltSort1 {

    // Function to print Array
    public static void PrintArray(int array[]){
        int n = array.length;
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {5,65,4,3,8,1};
        Arrays.sort(arr);
        PrintArray(arr);
        
    }
}
