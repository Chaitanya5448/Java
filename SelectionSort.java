public class SelectionSort {

    public static void Selection(int array[]){
        int n = array.length;
        // kiti turn pahije tyasathi outer loop.
        for(int i=0;i<n-1;i++){
            // pahale aata i nusar first element 0 so min var declare.
            int minnum = i;
            for(int j=i+1;j<n;j++){
                // condtn jar selected number motha aahe than next so next banel minnum.
                if(array[minnum]>array[j]){
                    minnum = j;
                }
            }
            //swap
            int temp = array[minnum];
            array[minnum]=array[i];
            array[i]=temp;
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
        Selection(array);
        PrintArray(array);
    }
}
