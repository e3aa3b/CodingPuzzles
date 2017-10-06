/*

        S   2   3
        4   5   6
        7   8   E
    
    Find number of routes from S to E (Start to End; S&amp;E will be ints)

*/

public class MatrixPath {
    public static void main(String args[]) {
        
        int[][] matrixArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        int count = countPaths(matrixArray);
        
        System.out.println(count);
        
    }
    
    public static int countPaths(int[][] matrix){
        
        return countPaths(matrix, 0, 0);
        
    }
    
    public static int countPaths(int[][] matrix, int n, int m){
        
        if(n < matrix.length && m < matrix[0].length){
            if(n == matrix.length-1 && m == matrix[0].length-1){
                return 1;
            }
            return countPaths(matrix, n+1, m) + countPaths(matrix, n, m+1);
        
        }
        
        return 0;
    }
}

