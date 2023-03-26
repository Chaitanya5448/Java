public class ClearBit {

    public static int Clearkar(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(Clearkar(5, 3));
    }
}
