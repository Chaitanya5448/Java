public class StarPattern {
    // main code start hoty
       public static void main(String args[]){
        //kiti line aahe te tak ani counter kar upadte sathi starting from 1
        for(int line=1;line<=4;line++){
            // nntr parat ek navin variable jo * print karel plus to line chya equal asel tr * print hoil nahi tr next line var jaun parat line wali variable pasun code update houn run hoil.
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            //if line = star mag loop chya baher padhun next line madhe jyasathi.
            System.out.println();
        }
    }    
}
                                       
