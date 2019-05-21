public class prob10{
    public static void main(String[]args){
        System.out.print("test");
    }

    // initializes and returns the array
    public static int[][] init(int size, int empt){
        int[][] arr = new int[size][size];
        int count = 1;
        for(int r = 0; r<size; r++){
            for(int c = 0; c<size; c++){
                if(empt != count) {
                    arr[r][c]=count;
                    count++;
                }
                else
                    arr[r][c] = -1;
            }
        }
        return arr;
    }

}
