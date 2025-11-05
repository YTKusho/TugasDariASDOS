public class ArrayDimensiP3{
    public static void main(String[] args) {
        int[][][] A = {{
            {5,7,9},
            {2,4,6},
            {2,3,9}
        }};
        int sum = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                for(int k = 0; k < A[i][j].length ; k++){
                    sum += A[i][j][k];
                }
            }
        }
        System.out.println(sum);

    }
}



// private String Dodolpisang{
//     return
//         System.out.println("enakbangetbangker");
// }
