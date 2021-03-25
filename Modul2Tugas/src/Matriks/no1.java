
package Matriks;
public class no1 {
    public static void main(String[] args) {
        
        int matriks[][] = new int [3][3];
        matriks[0][0] = 34;
        matriks[0][1] = 56;
        matriks[0][2] = 41;
        matriks[1][0] = 45;
        matriks[1][1] = 36;
        matriks[1][2] = 37;
        matriks[2][0] = 51;
        matriks[2][1] = 32;
        matriks[2][2] = 46;
        
        for(int m = 0; m<matriks.length; m++ ){
            for(int n = 0; n<matriks[0].length; n++){
                System.out.print(matriks[m][n]+" ");
            }
                System.out.println();
        }
        System.out.println();
            System.out.println(matriks[1][2]);
                System.out.println();
                    System.out.println("faisal ali m");
    }
}
