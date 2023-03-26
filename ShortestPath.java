public class ShortestPath{

    public static float Path(String directions){
        // saglyat basic kay aahe aplykade ie axis so declare it.
        int x=0;
        int y=0;
        //loop karan pratyak char sathi function work hoil
        for(int i=0;i<directions.length();i++){
            //direction
            char dir = directions.charAt(i);
            //west
            if(dir == 'W'){
                x--;
            }
            //east
            if(dir == 'E'){
                x++;
            }
            //north
            if(dir == 'N'){
                y++;
            }
            //south
            if(dir == 'S'){
                y--;
            }
        }
        //condition jhale aata main form che var declare kar
        int x2 = x*x;
        int y2 = y*y;
        //ans formula madhun return kar.
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String directions = "WNEENESENNN";
        //output
        System.out.println(Path(directions));
    }
}
