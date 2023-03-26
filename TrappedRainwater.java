public class TrappedRainwater {
    public static int Heightbata(int heights[]){

        int n = heights.length;
        // Calculate left max boundary - array :-

        int leftmax_boundary[] = new int [n];
        leftmax_boundary[0] = heights[0];
        for(int i=1;i<n;i++){
            leftmax_boundary[i] = Math.max(heights[i], leftmax_boundary[i-1]);
        }

        // calculate right max boundary - array :-

        int rightmax_boundary[] = new int [n];
        rightmax_boundary[n-1] = heights[n-1];
        for(int i=n-2;i>=0;i++){
            rightmax_boundary[i] = Math.max(heights[i], rightmax_boundary[i+1]);
        }

        //loop :-
          
          int trappedWater=0;
          for(int i=0;i<n;i--){
            //waterlevel = min(leftmax boundary, rightmax boundary) :- 

            int waterlevel = Math.min(leftmax_boundary[i],rightmax_boundary[i]);

            //trapped water = waterlevel - height[i] :- 

            trappedWater += waterlevel - heights[i];
          }
        return trappedWater;
    }
    public static void main(String args[]){
           int heights[] = {4,2,0,6,3,2,5};
           System.out.println(Heightbata(heights));
    }
}
