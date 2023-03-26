public class Clearlast_i_Bit {

    public static int iClearkar(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(iClearkar(15, 2));
    }
}
