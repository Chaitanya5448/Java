public class EvenorOddbyBitOpt {

    public static void EvenkaOdd(int n){
        int Bitmask =1;
        if((n & Bitmask) == 0){
          //even number condition
          System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String args[]){
       EvenkaOdd(3);
    }
}
