public class CountSetBitsinNum {

    public static int CountBit(int n){
       int count = 0;
       while(n>0){
        if((n&1) != 0){
            //checking lsb
            count++;
        }
        n = n>>1;
       }
       return count;
    }
    public static void main(String args[]){
        System.out.println(CountBit(5));
    }
}
