public class ArrayDimensiP2 {
    public static void main(String[] args) {
        int[][] C = {
            {10,15,20},
            {9,25,14}
        };
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < C.length; i ++){
            for(int j = 0; j < C[i].length; j++){
                if(C[i][j] > max){
                    max = C[i][j];
                }
            }
        }
        System.out.println(max);
    }
}



