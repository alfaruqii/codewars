import java.util.Arrays;
public class Kata {

	public static int[][] matrixMultiplication(int[][] a, int[][] b) {
    if((a[1].length != b.length) && (a.length > 1)){
      return null;
    }
    int[][] result = new int[a.length][b.length];
    for(int i=0;i<result.length;i++){
      for(int j=0;j<result[i].length;j++){
        result[i][j] = 0;
        for(int k=0;k<result.length;k++){
          result[i][j] += a[i][k]*b[k][j];
        }
      }
    }
    return result;
