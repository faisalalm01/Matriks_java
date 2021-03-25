package Matriks;
public class no2 {
    public static void main(String[] args) {
        
         int [][] A ={ 
            {45, 27},
            {11, 22},
            {18, 34}
        };
        int [][] B= {
            {60, 15},
            {5, 8},
            {13,13}
        };
        if((A.length == B.length) && (A[0].length == B[0].length)) {
            int [][] C = new int[A.length][A[0].length];
             for(int i=0; i<A.length; i++){
                 for(int j=0; j<A[0].length; j++){
                    C[i][j] += A[i][j] - B[i][j];
             } 
        }
        for (int []c :C){
            for(int q : c){
                System.out.print(q+" ");
            }
            System.out.println();
            }
        } 
        else {
            System.out.println("ukuran matriks tidak sama");
    }
       System.out.println("Faisal ali m");
    }
}
