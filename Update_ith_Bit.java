public class Update_ith_Bit{

    public static int Clearkar(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updatebit(int n, int i, int newbit){

        n = Clearkar(n, i);
           int  bitmask = newbit<<i;
            return n |bitmask;

    }
    
    public static void main(String args[]){
        System.out.println(updatebit(10, 2, 1));
    }
}