// import java.util.Scanner;

// public class PrimeorNot {
//     public static void main(String args[]){
//           try (Scanner sc = new Scanner(System.in)) {
//             int n = sc.nextInt();
//               if(n == 2) {
//                 System.out.println("n is prime");
//             } else {
//                 boolean isPrime = true;
//             for(int i=2; i<=n-1; i++) {
//                  if(n % i == 0) { // n is a multiple of i (i not equal to 1 or n)
//                      isPrime = false;
//             if(isPrime == true) {
//                 System.out.println("n is prime");
//              } else{
//                 System.out.println("n) is not prime");
//              }
//             }
//           }
//         }
//      }
//    }
//  }


public class PrimeorNot{

  public static boolean isprime(int n){
      boolean isprime = true;
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n % i == 0){
        isprime = false;
      }
    }
    return isprime;
  }
  public static void main(String args[]){
    System.out.println(isprime(5));
  


  }
}