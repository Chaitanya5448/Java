public class DtoB {

    public static void DectoBin(int DecNum){
        int myNum = DecNum;
         int pow = 0;
         int BinNum =0;

         while(DecNum>0){
            int Remainder = DecNum/2;
            BinNum = BinNum + (Remainder * (int)Math.pow(10, pow));
            pow++;
            DecNum = DecNum/2;
         }
         System.out.println("Binary Number of" + myNum + "=" + BinNum);
    }
    public static void main(String args[]){
        DectoBin(7);
    }
}
