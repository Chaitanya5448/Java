public class FunctnOverloadingpara {

    public static int sum(int a,int r){
        return a+r;
    }

    public static int sum(int a, int r, int c){
        return a+r+c;
    }
    public static void main(String args[]){
        System.out.println(sum(5, 3));
        System.out.println(sum(5, 02, 01));
    }
}
