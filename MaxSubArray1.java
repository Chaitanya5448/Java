public class MaxSubArray1 {
    public static void PrintSumofSubarrays(int numbers[]){
        int CurrentSum =0;
        int MaxSum =Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                CurrentSum =0;
                for(int k=start;k<=end;k++){
                    CurrentSum += numbers[k];
                }
                System.out.println(CurrentSum);
                if(MaxSum<CurrentSum){
                    MaxSum = CurrentSum;
                }
            }
        }
        System.out.println("Max Sum is : " + MaxSum);
    }
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        PrintSumofSubarrays(numbers);
    }
}
