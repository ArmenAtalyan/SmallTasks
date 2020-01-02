import java.util.HashSet;
import java.util.Set;

public class DifferentSquares {
    //Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.
    int differentSquares(int[][] matrix) {

        Set<String> set = new HashSet<>();

        if(matrix.length == 1 || matrix[0].length == 1)
            return 0;
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                set.add(matrix[i-1][j-1]+" "+matrix[i-1][j]+" "+matrix[i][j-1]+" "+matrix[i][j]);
            }
        }
        return set.size();
    }

}
