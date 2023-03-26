public class LargestNuminArray {

    public static int LargestNum(int Numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<Numbers.length;i++){
            if(largest < Numbers[i]){
                largest = Numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
          int Numbers[] = {2,3,4,5,6,7,8,9};
          System.out.println("The Largest Number in Array is : " + LargestNum(Numbers));
    }
}
