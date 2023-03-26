public class MethodOverloading{
    public static void main(String[] args) {
       calculator c1 = new calculator();
       System.out.println(c1.sum(5, 06));
       System.out.println(c1.sum((float)3.2,(float) 2.8));
       System.out.println(c1.sum(3, 06, 01)); 
    }
}

class calculator{

    int sum(int a,int b){
    return a+b;
    }

    float sum(float a,Float b){
        return a+b;
        }

    int sum(int a, int b, int c){
        return a+b+c;
    }

}