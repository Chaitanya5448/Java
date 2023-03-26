public class BinomialCoeff {
    
    public static int Factorialde (int n){
        int f =1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }

    public static int BinoCoef(int n,int r){
        int fact_n = Factorialde(n);
        int fact_r = Factorialde(r);
        int fact_nmr = Factorialde(n-r);

        int BinoCoef = fact_n / (fact_r*fact_nmr);
        return BinoCoef;
    }

    public static void main (String args[]){
        System.out.println(BinoCoef(5, 2));
    }
}
