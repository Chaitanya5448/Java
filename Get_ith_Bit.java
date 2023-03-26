public class Get_ith_Bit {

    public static int GetBit(int n, int i){
        int bitmask = 1 << i;
        if((n & bitmask) == 0){
           return 0;
        }else{
           return 1;
        }
    }
    public static void main(String args[]){
    System.out.println(GetBit(10, 3));
    }
}
