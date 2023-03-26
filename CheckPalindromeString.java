public class CheckPalindromeString{
    // Function type boolean ghetle inorder to check aahe ki nhi it's like T or F so Boolean
    public static boolean CheckPalindrome(String word){
        //pratyak char sathi aaply jhala pahije function code so loop
        //As to check palindrome we half the word therefore loop start with index number 0 to n-i-1(normally it would be n-1 but inorder to check from back to front to every element we used n-i-1)
        for(int i=0;i<word.length()/2;i++){
            //Particular char badal code kartana we have to use .charAt(index)
            //So, if i == n-i-1
            //then it's a palindrome.
            if(word.charAt(i) == word.charAt(word.length()-i-1)){
                return true;
            }
        }
        //else it's not a palindrome so return false
        return false;
    }
    public static void main(String args[]){
        String word = "Noon";
        //Output
        System.out.println(CheckPalindrome(word));
    }
}
