import java.util.*;

public class Matrix{
    public static boolean Search(int matrix[][] , int key){
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
               if(matrix[i][j]==key){
                 return true; 
               }
            }
        }
        return false;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int matrix[][] = new int[3][3];

        // Number of row
        int n=matrix.length;
        // Number of column
        int m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        Boolean result= Search(matrix, 0);
        System.out.println(result);

    }
}