package Matriks;
public class no3 {
        public static void main(String[] args) {
          
        int[][] A ={ 
           {4,5,4},
           {4,3,2}
        };
        int[][] B= {
           {3, 4},
           {4, 3},
           {4, 2}
        };
        
        if(A.length == B[0].length){
        int C[][] = new int [A.length] [B[0].length];
        for(int n = 0; n<A.length; n++){
            for(int m = 0; m<B[0].length; m++){
                for(int o = 0; o<A[0].length; o++){
                   C[n][m] += A[n][o] * B[o][m];
        }
                    
            }
        }
        for(int[]c: C){
            for(int n:c){
            System.out.print(n+" ");
            }
            System.out.println();
        }
    }else{
            System.out.print("ukuran baris A tidak sama dengan baris B");
        }
            System.out.println();
        System.out.println("faisal ali m");
    }
}
