package Matriks;
public class no4 {
public static void main(String[] args) {
        int[][]B = {
            {2, 1, -5},
            {3, 4, 2}   
        };
        System.out.println("matriks belum di tranpose :  ");
        int[][]tranpose = new int[3][2];
        for(int i=0; i<B.length; i++){
                for(int j=0; j<B[0].length;j++){
                    System.out.print(B[i][j]+" ");
                }
                System.out.println();
        }
           for(int i=0; i<B.length; i++){
                for(int j=0; j<B[0].length;j++){
                    tranpose[j][i] = B[i][j];
                    }
        }
        System.out.println("matriks sudah di tranpose :  ");
             for(int i=0; i<B[0].length; i++){
                for(int j=0; j<B.length;j++){
                  System.out.print(tranpose[i][j]+" ");
                }
                System.out.println();
        }
             System.out.println();
        System.out.println("faisal ali m");
        
    }
}
  
