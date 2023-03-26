public class MaxSubArray3 {
    public static void Kadane(int numbers[]){
    int ms = Integer.MIN_VALUE;
    int cs =0;
    for(int i=0;i<numbers.length;i++){
        cs = cs + numbers[i];
        if(cs<0){
            cs=0;
        }
        ms = Math.max(cs,ms);
    }
    System.out.println("Max of subbarray is : " + ms);
    }
    public static void main(String args[]){
         int numbers[] = {2,4,6,8,10};
         Kadane(numbers);
    }
}
