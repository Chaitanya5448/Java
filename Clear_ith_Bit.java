public class Clear_ith_Bit {
    public static int Clearsit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main (String args[]){
    System.out.println(Clearsit(10, 3));
    }
}
