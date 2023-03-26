public class LinearSearchinArray {

    public static int Search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,54,63,10,65,87,9,6,61};
        int key = 10;

        System.out.println("The Index no is : " + Search(numbers, key));
    }
}
