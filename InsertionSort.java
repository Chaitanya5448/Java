public class InsertionSort {

    public static void Inserter(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int curr =arr[i];
            int prev =i-1;
            //to find out place to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
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
        int arr[] = {5,4,1,3,2};
        Inserter(arr);
        PrintArray(arr);
    }
}
