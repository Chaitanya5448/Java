public class Set_ith_Bit {
    public static int SetBit(int n, int i){
         int bitmask = 1<<i;
         return n |  bitmask;
    }
    public static void main(String args[]){
        System.out.println(SetBit(10, 2));
    }
}
