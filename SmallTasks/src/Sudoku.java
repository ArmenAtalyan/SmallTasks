import java.util.ArrayList;
import java.util.Collections;

public class Sudoku {
    //Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9
    // grid with digits so that each column, each row, and each of the nine 3 × 3
    // sub-grids that compose the grid contains all of the digits from 1 to 9.
    //This algorithm should check if the given grid of numbers represents a correct solution to Sudoku.
    boolean sudoku(int[][] grid) {

        class Helper {
            boolean checkBlock(ArrayList<Integer> block) {
                ArrayList<Integer> sample = new ArrayList<>();
                for (int i = 1; i < 10; i++) {
                    sample.add(i);
                }
                Collections.sort(block);
                if (block.equals(sample)) {
                    return  true ;
                }
                return false;
            }
        };
        Helper h = new Helper();

        ArrayList<ArrayList<ArrayList<Integer>>> subgrids = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            ArrayList<ArrayList<Integer>> tmp = new ArrayList<>();
            subgrids.add(tmp);
            for (int j = 0; j < 3; j++) {
                ArrayList<Integer> tmp2 = new ArrayList<>();
                subgrids.get(i).add(tmp2);
            }
        }

        for (int i = 0; i < 9; i++) {
            ArrayList<Integer> horizontal = new ArrayList<>(),
                    vertical = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                horizontal.add(grid[i][j]);
                vertical.add(grid[j][i]);
                subgrids.get(i / 3).get(j / 3).add(grid[i][j]);
            }
            if (!h.checkBlock(horizontal)) {
                return false;
            }
            if (!h.checkBlock(vertical)) {
                return false;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!h.checkBlock(subgrids.get(i).get(j))) {
                    return false;
                }
            }
        }

        return true;
    }

}
