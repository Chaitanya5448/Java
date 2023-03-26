public class BubbleSort {

    public static void BubbleSorter(int array[]){
        int n = array.length;
        // turns sathi outer loop aahe ha
        for(int turn = 0; turn<n;turn++){
            //larger element pudhe karnyasathi inner loop
            for(int j=0;j<n-1-turn;j++){
            // swap karyacha code
               if(array[j]>array[j+1]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
               }
            }
        }
    }
    // Function to print Array
    public static void PrintArray(int array[]){
        int n = array.length;
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int array[] = {5,4,1,3,2};
        // Calling both function.
        BubbleSorter(array);
        PrintArray(array);
    }
}
