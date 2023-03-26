public class BtoD{

    public static void BintoDec(int BinNum){
        int myNum = BinNum;
        int pow =0;
        int decnum =0;
    
        while(BinNum>0){
            int lastdigit = BinNum % 10;
            decnum = decnum + (lastdigit *(int) Math.pow(2,pow));
            pow++;
            BinNum = BinNum%10;
        }
        System.out.println("Decimal Number for " + myNum + " = " + decnum);
    }
    public static void main(String args[]){
         BintoDec(101);
    }
}
