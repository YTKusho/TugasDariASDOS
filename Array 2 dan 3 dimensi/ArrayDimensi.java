public class ArrayDimensi {
   public static void main(String[] args) {
        // int[] D1 = {1, 2,3 ,4, 5, 6, 7};
        // int total = 0;
        // for(int i = 0; i < D1.length; i++){
        //     System.out.print(D1[i] + " ");
        // }
        int[][] D2 = {{5 , 7 , 9} , {2 , 4 , 6} , {7 , 8 , 9}};
        for(int i = 0; i<D2.length;i++){
            for(int j = 0; j < D2[i].length;j++){
                System.out.print(D2[i][j] + " ");
            }
            System.out.println();
        }
   }
}
